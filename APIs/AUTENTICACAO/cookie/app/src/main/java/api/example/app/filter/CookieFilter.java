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
