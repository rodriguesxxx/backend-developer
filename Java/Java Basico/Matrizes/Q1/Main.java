import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        
        int[] valores = {3,2,4};
        int alvo = 6; 
        int[] posicoes = new int[2];

        HashMap<Integer, Integer> table = new HashMap<>();
        for(int i = 0; i < valores.length; i++) {
            int s1 = alvo - valores[i];
            if(table.containsKey(s1)) {
                posicoes[0] = table.get(s1);
                posicoes[1] = i;
            }
            table.put(valores[i], i);
        }

        System.out.println(posicoes[0]);
        System.out.println(posicoes[1]);
    }   

}
