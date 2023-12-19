/* Escreva um programa em Java que crie uma lista de nomes de frutas. Adicione pelo menos 5 frutas diferentes à lista. Em seguida, remova a terceira fruta da lista e exiba a lista resultante na tela. */

import java.util.LinkedList;

public class Fruits {
    public static void main(String[] args){
        LinkedList<String> fruits = new LinkedList<>();
        for(String fruit : new String[]{"Maça", "Pera", "Uva", "Tomate", "Kiwi"}){
            fruits.add(fruit);
        }
        fruits.remove(2);
        System.out.println(fruits);
    }
}
