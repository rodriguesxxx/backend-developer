import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class Declaration {

    public static Random generate = new Random();

    public static String TreeSet(){

        Set<Integer> numbers = new TreeSet<>();
        for(int i = 10; i > 0; i--){
            numbers.add(
                generate.nextInt(1000)
            ); //adiciona os numeros do maior para o menor
        }
        return numbers.toString(); //resultado: muda a cada execucao
    }

    public static String HashSet(){
        Set<Integer> numbers = new HashSet<>();
        int cont = 10;
        while(cont > 0){
            numbers.add(
                generate.nextInt(1000)
            ); //os numeros nao sao ordenados
            cont--;
        }
        return numbers.toString(); //resultado: muda a cada execucao
    }

    public static void main(String[] args){

        System.out.println(TreeSet());
        System.out.println(HashSet());

    }
}
