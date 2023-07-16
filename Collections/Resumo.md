## Coleções - Collections

As collections sao utilizadas para armazenar,  manipular e recuperar dados de forma rapida e eficiente.
Como exemplo de collection, temos  a **List**. Que é uma coleção ordenada de elementos, que permite ao usuario ter controle preciso sobre a posição em que cada elemento inserido.

<img src="https://hermes.digitalinnovation.one/articles/cover/7135f29f-80d6-4521-babe-3c129d8ac21a.png">

## Interfaces

Uma interface é uma forma de definir um contrato ou especificacao para a comunicacao entre componentes ou entidades. Ela é um tipo abstrato que define a assinatura dos metodos que devem ser implementados pelas classes que a utilizam. **Exemplo de interface:**

```java
    /*
     * @author Daniel Rodrigues
    */

    interface Animal{
        
        public void tipo(); //mamifero * onivoro  * carnivoro
    
    }


    class Mamifero implements Animal{

        @Override //nao e obrigatorio ter, mas e uma boa pratica
        public void tipo(){
            System.out.println("Mamifero");
        }
    }


    class Carnivoro implements Animal{

        @Override //nao e obrigatorio ter, mas e uma boa pratica
        public void tipo(){
            System.out.println("Carnivoro");
        }
    }

    public class Main{

        public static void main(String[] args){
            Animal car = new Carnivoro();
            car.tipo();
        }
    }
```

## Collection List

sintax: 
```java
    //Primeira forma de declaracao
    List<TipoDaLista> nomeDaLista = new ArrayList<>();

    //Segunda forma de declaracao
    ArrayList<TipoDaLista> nomeDaLista = new ArrayList();
```
### Declarando List:

```java

    import java.util.List;
    import java.util.ArrayList;

    class Declaration{

        public List<String> methodOne(){
            
            List<String> oneList = new ArrayList<>();
            
            return oneList;
        }

        public ArrayList<String> methodTwo(){
            
            ArrayList<String> twoList = new ArrayList();
            
            return twoList;
        }

        public static void main(String[] args){
            
            Declaration dcl = new Declaration();

            List<String> myListOne = dcl.methodOne(); //sim poderia fazer direto, mas qual é graca kkk

            ArrayList<String> myListTwo = dcl.methodTwo();

            myListOne.add("Teste 1");
            myListTwo.add("Teste 2");

            System.out.println(myListOne);
            System.out.println(myListTwo);
        }

    }
    
```



O List é uma interface e o ArrayList é a classe que o implementa