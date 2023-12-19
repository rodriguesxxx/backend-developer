/* Escreva um programa em Java que crie duas listas de números inteiros. Preencha a primeira lista com os números de 1 a 5 e a segunda lista com os números de 6 a 10. Em seguida, concatene as duas listas em uma terceira lista e imprima seu conteúdo na tela. */
import java.util.LinkedList;

public class MescleList {
    public static void main(String[] args){
        LinkedList<Integer> lst1 = new LinkedList<>();
        LinkedList<Integer> lst2 = new LinkedList<>();
        LinkedList<Integer> mescle = new LinkedList<>();

        for(Integer value : new Integer[]{1,2,3,4,5}){
            lst1.add(value);
        }
        for(Integer value : new Integer[]{6, 7, 8, 10}){
            lst2.add(value);
        }
        mescle.addAll(lst2);       
        mescle.addAll(lst2);
        System.out.println(mescle);

    }
}
