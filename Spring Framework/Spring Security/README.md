# Spring Security

## Introdução

É um grupo de filtros servlet que ajudam a adicionar autenticao e autorizacao a sua aplicacao web.

## Autentição

É o processo de verificação da identidade de um usuario, com base nas credencias fornecidas. exemplo:
email/senha


## Autorizacao

É o processo que determina se usuario pode ou não fazer certas coisas dentro do sistema.

## Adicionando ao projeto

##### Apache Maven:

```xml

    <dependency>
        <groupId>org.springframework boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>

     <dependency>
        <groupId>org.springframework.security</groupId>
        <artifactId>spring-security-test</artifactId>
        <scope>test</scope>
    </dependency>
```

##### Gradle:

```groovy
dependencies {
  implementation 'org.springframework.boot:spring-boot-starter-security'
  testImplementation 'org.springframework.security:spring-security-test'
}
```

## Autenticação simples

Por padrão o spring gera uma password, a cada vez que a aplicacao é iniciada, podemos controlar isso.

### Definindo usuario e senha

defina os seguintes campos dentro do **application.properties**

    spring.security.user.name=<your_name>
    spring.security.user.password=<your_password>
    spring.security.user.roles=USERS