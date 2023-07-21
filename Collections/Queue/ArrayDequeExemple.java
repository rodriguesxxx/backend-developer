
import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeExemple {
    public static void main(String[] args){
        Deque<Integer> filaOne = new ArrayDeque<Integer>();
        filaOne.add(10);
        filaOne.add(4);
        filaOne.add(8);
        filaOne.add(2);

        Deque<Integer> filaTwo = new ArrayDeque<Integer>();
        filaTwo.add(22);
        filaTwo.addAll(filaOne);
        System.out.println(filaTwo);

        while(filaTwo.size() != 0)
            System.out.println(filaOne.remove());
    }
}
