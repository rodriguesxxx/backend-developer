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

