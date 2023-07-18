/* Escreva um programa em Java que crie uma lista de números inteiros e preencha-a com os valores de 1 a 10. Em seguida, percorra a lista e imprima na tela apenas os números pares. */

import java.util.ArrayList;

class EvenNumbers{

    public static boolean isPair(Integer value){
        return (value % 2 == 0) ? true : false;
    }

    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            values.add(i);
        }
        for(int value : values){
            if(EvenNumbers.isPair(value)){
                System.out.println("par: "+value);
                continue;
            }
            System.out.println("impar: "+value);

        }
    }
}