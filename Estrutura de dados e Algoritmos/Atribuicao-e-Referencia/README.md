## Atribuição e Referência no Java

- As atribuições em Java são por cópia de valor sempre.

- Com tipo primitivo, copiamos o valor em memoria.

- Com objetos copiamos o valor da referencia em memoria, sem duplicar o objeto.

## Exemplos:

#### Tipo primitivo

```java
class ExemploTipoPrimitivo{
    public static void main(String[] args) {

        int a = 1;
        int b = a;

        System.out.println("Valor de a = "+a);
        System.out.println("Valor de b = "+b);

        System.out.println("Modificando o valor de b");

        b = 2;
        
        System.out.println("Valor de a = "+a); //o valor de a continua o mesmo
        System.out.println("Novo valor de b = "+b);


    }   
}  
```

#### Objetos

```java
class People{
    public String name;

    public People(String name){
        this.name = name;
    }
}


public class ExemploObjeto{
    public static void main(String[] args) {

        People a = new People("Mario");        
        
        People b = a;


        System.out.println("Valor de a = "+a.name);
        System.out.println("Valor de b = "+b.name);

        System.out.println("Modificando o valor de b");

        b.name = "Maria";

        System.out.println("Valor de a modificado = "+a.name); //o valor de a tambem foi modificado
        System.out.println("Novo valor de b = "+b.name);


    }   
}

```