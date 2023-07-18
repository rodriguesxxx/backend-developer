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

## LinkedList x ArrayList

Ambos tem a mesma forma de declaracao, o que os diferencia é a performace em alguns metodos.
O LinkedList é muito mais performatico em adicionar ou remover  um elemento.
Já o ArrayList é mais rapido em buscar um elemento.

### Teste de performace:

```java
import java.util.ArrayList;
import java.util.LinkedList;



public class Performace {
    static ArrayList<Integer> arraylist = new ArrayList();
    static LinkedList<Integer> linkedlist = new LinkedList();

    public static Long[] testAdd(){

        /* ArrayList add */
        Long startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            arraylist.add(i);
        }

        Long endTime = System.nanoTime();

        Long duration1 = endTime - startTime;

        /* LinkedList add */
        startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            arraylist.add(i);
        }
        endTime = System.nanoTime();

        Long duration2 = endTime - startTime;

        return new Long[]{duration1, duration2};
    }

    public static void main(String[] args){
        Long[] testAdd = Performace.testAdd();
        System.out.println("ArrayList time: "+testAdd[0]);       
        System.out.println("LinkedList time: "+testAdd[1]);
        //Faca outros tests como o de get ou de remove

    }
}
```

## Queue(Filas)