# O que é cookie?

o cookie é um pequeno arquivo de texto, possuinbdo uma chave e o seu valor.
os cookies são utilazados para armazenar informacoes do navegador do usuario, que podem ser utilizados pela sua aplicação.

## Cookie como forma de autenticação
Apesar de não ser a melhor forma de autenticação atualmente, muito serviços ainda o utilizam. Um bom programador consegue implementar esse metodo de autenticacao de forma segura de otimizada.

## Cookie + Spring Boot
Criamos um service para setar/pegar cookies da nossa aplicação
```java
package api.example.app.services;

import java.util.Optional;
import java.util.Arrays;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieService {

    public static String getCookie(HttpServletRequest request, String key) {
        return Optional.ofNullable(request.getCookies())
                .flatMap(cookies -> Arrays.stream(cookies)
                .filter(cookie -> key.equals(cookie.getName()))
                .map(Cookie::getValue)
                .findFirst()
            )
            .orElse(null);

    }

    public static void setCookie(HttpServletResponse response,String key, String value){
        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

}
```
file: CookieService.java

A cada login do usuario setaremos um cookie com o seu id:

```java
@PostMapping("/login")
    public ResponseEntity<Map> login(@RequestBody User user, HttpServletResponse response){
        if( admin.equals(user) ){
            CookieService.setCookie(response, "userid", user.getId().toString());
            return new ResponseEntity<>(
                Collections.singletonMap(user.getUsername(), user.getPassword()),
                HttpStatus.ACCEPTED
            );
        }

        return new ResponseEntity<>(
            Collections.singletonMap("error", "invalid username or password"),
            HttpStatus.UNAUTHORIZED
        );
    
    }
```
file: AuthController.java


Agora precisamos criar um filtro para que toda vez que o usuario fizer um requisicao a nossa api, seja realizada uma verificacao de login.

```java
package api.example.app.filter;
import org.springframework.web.filter.OncePerRequestFilter;

import api.example.app.services.CookieService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // Verifique se a solicitação está indo para o endpoint /auth
        if ("/auth".equals(request.getRequestURI())) {
            // Se estiver, permita o acesso sem verificar o cookie
            filterChain.doFilter(request, response);
            return;
        }

        // O restante do código para verificar o cookie conforme necessário
        if (cookiePresent(request)) {
            // Se o cookie estiver presente, permita o acesso ao filtro seguinte (cadeia de filtros)
            filterChain.doFilter(request, response);
        } else {
            // Caso contrário, envie uma resposta indicando que o acesso não é permitido
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "Acesso negado. Cookie não encontrado.");
        }
    }

    private boolean cookiePresent(HttpServletRequest request) {
        String cookie = CookieService.getCookie(request, "userid");
        return cookie != null ? true : false;   
    }         
}

```
file: CookieFilter.java

Por fim, vamos implementar esse filtro na nossa aplicacao

```java
package api.example.app.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import api.example.app.filter.CookieFilter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CookieFilter> cookieFilter() {
        FilterRegistrationBean<CookieFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CookieFilter());
        registrationBean.addUrlPatterns("/api/*");
        return registrationBean;
    }

}
```

Todos os endpoints que tiver o /api, serão verificados.
