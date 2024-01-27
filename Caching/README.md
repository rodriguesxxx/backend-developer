<img src="https://www.hardware.com.br/wp-content/uploads/static/wp/2023/05/22/cache.jpg" alt="imagem ilustrativa com a palavra cache" />

O `cache` é uma técnica comumente utilizada em `aplicações web`, principalmente na parte do `backend`. O cache é basicamente o armazenamento `efêmero` de dados utilizados com frequência. Isso ajuda a reduzir o tempo que uma aplicação leva para acessar determinados dados, isso melhora a `experiência geral` do usuário e torna a aplicação mais `escalável`.

## Cache Raiz - Spring Boot

<img src="https://miro.medium.com/v2/resize:fit:850/1*8KX5TdvTf6HlEjls69uPjw.png" alt="imagem ilustrativa spring boot" />

Hoje, existem diversas ferramentas de cache, destacando-se o `Redis`, o `Memcached` e o `Varnish`. Essas são excelentes opções que oferecem desempenho notável.

    Para uma compreensão mais fácil, optaremos por utilizar o cache em memória integrado ao próprio framework.

-   #### Adicionando a Dependência

    No arquivo `pom.xml` adicione a dependência `cache`:

    ```xml

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-cache</artifactId>
    </dependency>
    ```

-   #### Habilitando o Cache

    No arquivo `main` adicione a seguinte notação:

    ```
    @EnableCaching
    ```

    **exemplo:**

    ```java
    package com.danielrodrigues.app;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.cache.annotation.EnableCaching;

    @SpringBootApplication
    @EnableCaching //Adicione a notação
    public class AppApplication {

        public static void main(String[] args) {
            SpringApplication.run(AppApplication.class, args);
        }

    }
    ```

-   #### Implementando Cache:

    Para usarmos o cache, basta adicionar a seguite notação: `Cacheable("nomeDoCache")`

    **exemplo:**

    ```java
    @Cacheable("commits")
    public int getCommitsCount() {
        String endpoint = baseUrl + "/search/commits?q=author:"+username;
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        try {
            ResponseEntity<GithubResponse> response = restTemplate.exchange(
                endpoint,
                HttpMethod.GET,
                entity,
                GithubResponse.class);
            return response.getBody().getTotalCount();
        } catch(Exception e) {
            return 0;
        }
    }
    ```

    Em apenas `3 passos` você `cacheou` sua aplicação.

## Tempo de Armazenamento

Também podemos `controlar` o `tempo` que determinado `cache` ficara salvo na memória.

-   #### Adicionando a Dependência

    No arquivo `pom.xml` adicione mais uma dependência: `caffeine`

    ```xml
    <dependency>
        <groupId>com.github.ben-manes.caffeine</groupId>
        <artifactId>caffeine</artifactId>
    </dependency>
    ```

-   #### Criando arquivo de Configuração

    Dentro do pacote `config` crie a classe de configuração `CacheConfig`.

    **código:**

    ```java
    package com.danielrodrigues.app.config;

    import org.springframework.cache.CacheManager;
    import org.springframework.cache.annotation.EnableCaching;
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.cache.caffeine.CaffeineCacheManager;
    import com.github.benmanes.caffeine.cache.Caffeine;
    import java.util.concurrent.TimeUnit;

    @Configuration
    @EnableCaching
    public class CacheConfig {

        @Bean
        public CacheManager cacheManager() {

            int limitTime = 5; //5 minutos: tempo em que o cache ficara salvo

            CaffeineCacheManager cacheManager = new CaffeineCacheManager("commits", "otherCache","otherCache2"); //adicione o nome dos caches
            cacheManager.setCaffeine(Caffeine.newBuilder().expireAfterWrite(5, TimeUnit.MINUTES));

            return cacheManager;
        }

    }
    ```

**Observação:** Se você busca alta escalabilidade, desaconselho o uso de `cache em memória`. Recomendo optar pelo `Redis`, pois proporcionará resultados significativamente melhores.

## Cache COM Redis - Spring Boot

<img src="https://architecturenotes.co/content/images/2022/07/Redis-v2-separate-05.jpg" />

O `redis` é um armazenamento de `estrutura de dados` `chave`-`valor`.

É como a estrutura `map` do `Java`

Os principais usos do `Redis` são: `cache`, `gerenciamento de sessões`, `PUB/SUB` e `classificações`.

**obs:** Esse conteúdo é uma continuação desse <a href="https://www.tabnews.com.br/rodriguesxxx/conteudo-a-arte-do-cache-spring-boot">post</a>.

-   ### Como funciona o Cache no Redis

    O Redis é inserido na **frente** de outro **banco de dados** e cria um cache na memória com excelente desempenho para diminuir a latência de acesso.

-   ### Adicionando a dependência

    No arquivo `pom.xml` adicione a `dependência` do redis

    ```xml
    <dependency>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
    </dependency>
    ```

-   ### Configurando aplicação

    Abra o arquivo `application.properties` e adicione a seguinte linha:

    ```properties
    spring.cache.type=redis
    ```

-   ### Deixando Model Serializavel

    **exemplo**:

    ```java
    import java.io.Serializable;

    public class Stats implements Serializable {}
    ```

-   ### Rodando imagem Redis - Para testes
    ```bash
    docker run --name my-redis -p 6379:6379 -d redis
    ```
    **Fácil, ne?**

## Extras

Mais sobre cache: https://medium.com/@genchilu/cache-strategy-in-backend-d0baaacd2d79
