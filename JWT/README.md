# JWT(JSON WEB TOKENS)

## O que é?
O JWT é um padrão aberto, por ele é possivel transmitir informações de forma compacta e segura. Ele atua entre o cliente e servidor. Isso tudo graças a algoritmos, são utilizados 3: HMAC, RSA e ECDSA

- #### HMAC
    O HMAC é um codigo de autenticacao para mensagens MAC, onde se é utilizado uma funcao HASH(md5, sha1, sha256).

- #### RSA
    Rivest-Shamir-Adleman(RSA) é a base de um sistema criptografico, é utilizado para criptografar chaves publicas, onde se é utilizado duas chaves diferentes, mas matematicamente vinculadas(uma publica e outra privada).

- #### ECDSA
    Elliptic Curve Digital Signature Algorithm(ECDSA) é utilizado na criacao de uma assinatura digital que permite a verificacao por terceiros de forma segura.


## Quando se deve usar?

- #### Autenticação
    Sem duvidas essa é a principal utilidade do JWT, após  efetuar o login do usuario, cada solicitação incluira o JWT, permitindo o acesso a rotas, servicoes e recursos permitidos aquele token.

- #### Troca de informacao
    Uma alternativa segura para transmitir informacoes com seguranca entre ambas as partes. Pode ser usado chaves publicas/privadas, assim voce pode confirmar se aquele usario é quem diz ser. Voce tambem pode verificar se o conteudo nao foi alterado durante a transferencia.

## Estrutura JWT

O JSON WEB TOKENS é sub-divido em 3 partes separados por "." 

    xxxx.yyyy.zzzz

sendo elas:

- #### Cabeçalho
    O cabeçalho consiste em duas partes: o tipo de token(no caso JWT) e o algoritmo de assinatura(HMAC, SHA256 ou RSA)

    exemplo:
    ```json
    {
        "alg": "HS256",
        "typ": "JWT"
    }
    ```
- #### Carga útil
    Na segunda camada temos a carga útil, que contem as declarações sobre uma entidade(normalment, o usuario) e dados adicionais.

    Existem três tipos de reivindicação: registradas, públicas e privadas.

    exemplo:
    ```json
    {
        "sub": "1234567890",
        "name": "John Doe",
        "admin": true
    }
    ```

- #### Assinatura
    Na criação da assinatura. voce deve pegar o cabecalho codificado, a carga util codificada, um segredo, o algoritmo especificado no cabecalho e assina-lo

    Por exemplo, caso voce use o algoritmo HMAC SHA256, a assinatura será:

        HMACSHA256(
        base64UrlEncode(header) + "." +
        base64UrlEncode(payload),
        secret)

    A assinatura serve para identificar se a mensagem nao foi alterada no meio do caminho,  no caso de tokens assinados com chave privada, também pode verificar se o remetente do JWT é quem diz ser.

## Juntando tudo
A saída são três strings de URL Base64, separadas por ".".

acesse para testes: https://jwt.io/#debugger-io

## Usando na pratica(com Spring boot)
Usando o spring initializer, adicione a dependencia do Spring Security ao seu projeto.

Após adicionar o Spring Security, os endpoints não "funcionaram" poís uma camada de seguranca foi adicionada. Se voce acessar o endpoint por um navegador será solicitado um login e senha.