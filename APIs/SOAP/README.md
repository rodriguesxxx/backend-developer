# PROTOCOLO SOAP

<img src="https://thumbs.dreamstime.com/z/fundo-do-conceito-de-tecnologia-protocolo-soap-simples-acesso-objetos-225558305.jpg">

o `Simple Object Access Protocol` é usado para troca de informações estruturadas.

É baseado em `XML` - Linguagem de marcação extensível. Onde sua `estrutura` consiste em **3 partes**: `envelope`, `header` e `body`.

O `SOAP` é idependente de `sistemas operacionais`, `modelos de objetos` e `linguagens de programação`, auxiliando a `Interoperabilidade` entre `objetos` e componentes `distribuidos`.

## Estrutura do Protocolo

-   **Envelope:** É o elemento `root` do documento `XML`. Ele pode conter declarações de namespaces e atributos adicionais.

-   **Header:** É um `cabeçalho opcional`. Contêm informações adicinais, como por exemplo: se a mensagem deve ser processada por um `nó intermediário`.

-   **Body:** Este elemento é obrigatório. É ele que contem a `payload`, ou `informação` a ser transportada para o `destino final`.

-   #### Exemplo de Estrutura

```xml

<SOAP-ENV:Envelope xmlns:SOAP-ENV=”http://schemas.xmlsoap.org/soap/envelope/”
    SOAP-ENV:encodingStyle=”http://schemas.xmlsoap.org/soap/encoding/”>
    <SOAP-ENV:header>
        <!-- Conteudo do header -->
    </SOAP-ENV:header>

    <SOAP-ENV:body>
        <!-- Conteudo do body -->
    </SOAP-ENV:body>
</SOAP-ENV:envelope>
```

-   **xmlns:SOAP-ENV** Define um `namespace` com o prefixo `SOAP-ENV`.
-   **encodingStyle:** Esse atributo é usado para indicar o `estilo de codificação` dos dados da mensagem `SOAP`.

-   ### Exemplo de Estrura - COM Header

```xml

<SOAP-ENV:Envelope xmlns:SOAP-ENV=”http://schemas.xmlsoap.org/soap/envelope/”
    SOAP-ENV:encodingStyle=”http://schemas.xmlsoap.org/soap/encoding/”>

    <SOAP-ENV:header>
        <authentication SOAP-ENV:actor="http://www.example.com/actor">
            <username>rodriguesxxx</username>
            <password>senhasegura</password>
        </authentication>
    </SOAP-ENV:header>

    <SOAP-ENV:body>
        <!-- Conteudo do body -->
    </SOAP-ENV:body>
</SOAP-ENV:envelope>
```

-   **actor** Especifica o `receptor` que deve `processar` os dados do `header`

-   ### Exemplo de Estrura - COM Body

```xml

<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
    SOAP-ENV:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">

    <SOAP-ENV:header>
        <authentication SOAP-ENV:actor="http://www.example.com/actor">
            <username>rodriguesxxx</username>
            <password>senhasegura</password>
        </authentication>
    </SOAP-ENV:header>

    <SOAP-ENV:Body>
        <pedido>
            <cliente>
                <nome>Daniel Rodrigues</nome>
            </cliente>
            <itens>
                <item>
                    <codigo>001</codigo>
                    <descricao>MacBook Pro</descricao>
                    <quantidade>1</quantidade>
                </item>
            </itens>
        </pedido>

        <SOAP-ENV:Fault>
            <faultcode>SOAP-ENV:Server</faultcode>
            <faultstring>Erro no servidor</faultstring>
            <detail>
                <errorDetails>
                    <errorCode>456</errorCode>
                    <errorMessage>Erro interno no processamento do pedido</errorMessage>
                </errorDetails>
            </detail>
        </SOAP-ENV:Fault>

    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

-   **_pedido_**: O `<pedido>` é um `elemento`, onde é utilizado para `encapsular informações` relacionadas a um pedido.

-   **_cliente_**: Dentro do elemento `<pedido>`, Temos um `elemento` `<cliente>` que contém informações sobre o cliente relacionado ao `pedido`.

...assim por diante.

-   **SOAP-ENV:Fault**: Esse elemento representa um `erro` ou uma `exceção`. Ele é utilizado para relatar problemas durante o `processamento` da mensagem `SOAP`

## Implementando Web Service - Java

Primeiramente, crie um projeto `maven` `quickstart`.

-   ### Adicione as dependências

```xml
<dependency>
    <groupId>jakarta.xml.ws</groupId>
    <artifactId>jakarta.xml.ws.api</artifactId>
    <version>3.0.0</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-rt</artifactId>
    <version>3.0.0</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-ri</artifactId>
    <version>3.0.0</version>
</dependency>
```

-   ### Crie a Interface do Service

Como `exemplo` vou criar um `service` para calcular os dias totais de vida de uma pessoa.

```java
package br.rodriguesxxx.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

import java.util.Date;

@WebService
@SOAPBinding (style = Style.RPC)
public interface IDaysOfLifeService {

    @WebMethod
    public String calculate(String year, String month, String day);

}
```

-   **@WebService**: Essa `notação` diz ao java que essa é a `interface` de um `web service`
-   **@SOAPBinding**: Essa `notação` indica o `estilo` de `dados` aceito, nesse caso o `RPC` -> estilo `simples de dados`.
-   **@WebMethod**: Indica que aquele é um `metodo` que pode ser usado pelo `client`.

-   ### Implementando Service

```java
package br.rodriguesxxx.services;

import jakarta.jws.WebService;

import java.time.LocalDateTime;
import java.util.Date;

@WebService(endpointInterface = "br.rodriguesxxx.services.IDaysOfLifeService")
public class DaysOfLifeService implements IDaysOfLifeService{

    public String calculate(String year, String month, String day) {
        LocalDateTime currentDate = LocalDateTime.now();
        Integer age = currentDate.getYear() - Integer.valueOf(year);
        Integer currentDays = Integer.valueOf(month) * 30 + Integer.valueOf(day);
        Integer daysOfLife = (age * 365) + currentDays;
        return daysOfLife.toString();
    }

}
```

Precimos deixar claro a `interface` que o `service` implementa. Para isso utilizamos a notação `@WebService` com o `path` da `interface`.

-   ### Publicando Web Service

Para isso vamos no `main` da nossa `aplicação`.

```java
package br.rodriguesxxx;

import java.util.Date;

import br.rodriguesxxx.services.DaysOfLifeService;
import jakarta.xml.ws.Endpoint;

public class App
{
    public static void main( String[] args )
    {
        DaysOfLifeService daysOfLifeService = new DaysOfLifeService();
        Endpoint.publish("http://localhost:8080/service/daysOfLife", daysOfLifeService);
        System.out.println("service is live!");
    }
}
```

-   **Endpoint**: Para `publicar` nosso WebService utilizamos o método `publish` da classe `Endpoint`. Passamos a `rota` e uma instância do `service`.

**_Basta executar..._**
