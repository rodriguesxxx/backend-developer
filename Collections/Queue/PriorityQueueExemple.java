import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueExemple {
    public static void main(String[] args){
        Queue<Integer> filaOne = new PriorityQueue<Integer>();
        filaOne.add(10);
        filaOne.add(4);
        filaOne.add(8);
        filaOne.add(2);

        Queue<Integer> filaTwo = new PriorityQueue<Integer>();
        filaTwo.add(22);
        filaTwo.addAll(filaOne);
        System.out.println(filaTwo);
        //os elementos sao ordenados de forma automatica
        while(filaTwo.size() != 0)
            System.out.println(filaOne.remove());
    }
}
