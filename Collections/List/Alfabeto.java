import java.util.Collections;
import java.util.ArrayList;


public class Alfabeto {
    public static void main(String[] args){
        ArrayList<Character> alfabeto = new ArrayList();
        alfabeto.add('C');
        alfabeto.add('E');
        alfabeto.add('A');
        alfabeto.add('F');        
        alfabeto.add('B');
        alfabeto.add('D');

        Alfabeto alf = new Alfabeto();
        System.out.println(alf.ordenaLista(alfabeto));
        
    }
    public ArrayList<Character> ordenaLista(ArrayList<Character> caracteres){
        Collections.sort(caracteres);
        return caracteres;
    }
}
