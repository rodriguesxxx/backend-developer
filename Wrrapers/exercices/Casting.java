public class Casting {
    
    static int convertInteger(int num){
        return (Integer) num;
    }
    
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);        
        Integer num2 = Casting.convertInteger(num);
        System.out.println(num2);


        sc.close();
    }
}
