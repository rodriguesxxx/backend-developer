# Testes Unitarios com o JUnit

Os testes de unidade tem como objetivo testar uma aplicacao em sua menor parte, que são os classes/metodos/funcoes

## Por que escrever testes unitarios?

- #### Compreender o codigo fonte
- #### Corrigir bugs com seguranca
- #### Refatorar codigo sem gerar bugs
- #### Entregar com seguranca novas features


## Principais recursos do JUnit

- JUnit Platform
- JUnit Jupiter
- JUnit Vintage

## Estrutura basica de teste

Tenha uma pasta de teste fora da main

exemplo de estruta de pastas:

    ├── main
    │   └── java
    │       └── backend
    │           └── study
    │               ├── Main.java
    │               └── services
    │                   └── Calculator.java
    └── test
        └── java
            └── CalculatorTest.java
    

Dentro da sua classe de teste, crie um metodo com a notacao @Test.

exemplo:

```java

public class CalculatorTest{
    @Test
    public void sumOperation(){
        //aqui vai o test
    }
}

```

obs: todos os metodos de test devem retornar void

Uma das classes do JUnit para efetuar os tests é a Assertions.

## Classe Assertions

A classe Assertions fornece varios metodos para diferentes tipos de testes

### Principais metodos:

- #### assertEquals(Object Value expected, Object Value actual);

- #### assertTrue(boolean condition actual);

- #### assertNotNull(Object Value actual);

- #### assertArrayEquals(Array[] expected, Array[] actual);