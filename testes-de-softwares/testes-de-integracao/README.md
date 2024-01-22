## O que são Testes de Integração?

Os `testes de integração` desempenham um papel crucial na identificação e correção de falhas que podem ocorrer quando diferentes partes ou módulos de um sistema `são combinados`. Imagine um sistema de comércio eletrônico, por exemplo. Durante os testes de integração, garantimos que o processo de adição de itens ao carrinho, a aplicação de descontos e o cálculo do valor total funcionem harmoniosamente juntos.

Outro exemplo seria em um sistema bancário, onde a integração entre o módulo de autenticação de usuário, o processamento de transações e a atualização de saldos deve ser cuidadosamente testada. Se houver falhas nessa integração, podem ocorrer erros críticos, como transações não registradas corretamente ou problemas de acesso à conta.

Assim, os testes de integração são `essenciais` para garantir que todas as peças do quebra-cabeça do sistema se encaixem perfeitamente.

## Testes de Integração na Prática

Para `validar os endpoints` da nossa aplicação, faremos uso do `TestRestTemplate`.

-   **TestRestTemplate**

    O TestRestTemplate é uma classe fornecida pelo ecossistema Spring para facilitar a realização de testes de integração em aplicações Spring Boot. Ele faz parte do módulo de testes do Spring Boot e oferece uma maneira simplificada de realizar solicitações HTTP durante os testes, especialmente para testes de integração que envolvem a interação com os endpoints de uma API.

**exemplo:**

```java
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MinhaAplicacaoIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testPing() {
        String url = "http://localhost:" + port + "/ping";
        String resposta = restTemplate.getForObject(url, String.class);
        assertEquals("pingou", resposta);
    }
}

```
