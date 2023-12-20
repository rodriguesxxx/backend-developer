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