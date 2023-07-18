class Wrraper {

    private Integer age = 18; 
    private Character sex;
    private Double sale;

    void testInteger(){
        System.out.println(this.age.compareTo(18) == 0 ? "Pode acessar" : "Nao pode acessar");
    }
    void testCharacter(){
        System.out.println(this.sex.toLowerCase('M'));
    }
    void testDouble(){
        System.out.println(this.sale.isNaN(3.2));
    }

    public static void main(String[] args){
        Wrraper wp = new Wrraper();
        wp.testInteger();
        wp.testCharacter();
        wp.testDouble();



    }
    
}