# Autenticação OAuth2

O OAuth2 não é a autenticacao em si, apenas o protocolo de autenticacao que deve ser seguido.

**Exemplo:**
Eu tenho um telefone. Como proprietario eu posso dar permisão ou não a outras pessoas utilizarem o meu telefone. Ai que entra o OAuth2.

**Proprietario = Servidor**

**Telefone = Funcionalidades da aplicacao**

**Pessoa = Cliente**

No padrao OAuth2, a cada solicitação é necessario um token de validação. Caso o token for valido a solicitação é atendida;

**Cliente faz solitação a endpoint -> Servidor valida o token -> Funcionalidade liberada **

## Estrutura OAuth2

Na estrutura OAuth2 existe um servidor de Autorização e outro servidor de Recursos.

### Authorization Server

#### Cliente -> Credencias -> Servidor valida

Se as credencias for validas

#### Servidor -> Token -> Cliente

Caso contrario

#### Servidor -> 401

### Resource Server

#### Cliente -> Token -> solicita recurso -> Servidor checa se o token é valido.

Se o token for válido

#### Servidor -> recurso -> cliente

Caso o token for válido, mas o cliente não tem permissao para aquele recurso

#### Servidor -> 403

Caso contrario

#### Servidor -> 401

## Login no OAuth2

Para efetuar um login no OAuth2, além das credencias do usuario, também é solicitado as credencias do client app(aplicação que consome a API )

#### app_credentials + user_credentials -> Auth Server

### APP Credentials

É solicitado o ID do cliente e a SECRET

**exemplo:**

-   **client_id: myappname**
-   **client_secret: myappsecret**

**Request Authorization**

Authorization "basic + Base64_encode(client_id+":"+client_secret)

### User credentials

-   **email(or other):** seila@gmail.com
-   **password:** 123456
-   **grant_type:** password //por ser email/senha o tipo de autenticacao é password(existe outros)

**_Body:_** x-wwww-form-urlencoded

### Retorno

O retorno é o token(o padrao mais utilizado é o JWT)

## Referencias

acesse: https://oauth.net/2
acesse: https://oauth.com/playground/
acesse: https://github.com/devsuperior/spring-boot-oauth2-jwt-demo