import java.util.ArrayList;
import java.util.LinkedList;



public class Performace {
    static ArrayList<Integer> arraylist = new ArrayList();
    static LinkedList<Integer> linkedlist = new LinkedList();

    public static Long[] testAdd(){

        /* ArrayList add */
        Long startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            arraylist.add(i);
        }

        Long endTime = System.nanoTime();

        Long duration1 = endTime - startTime;

        /* LinkedList add */
        startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            arraylist.add(i);
        }
        endTime = System.nanoTime();

        Long duration2 = endTime - startTime;

        return new Long[]{duration1, duration2};
    }

    public static void main(String[] args){
        Long[] testAdd = Performace.testAdd();
        System.out.println("ArrayList time: "+testAdd[0]);       
        System.out.println("LinkedList time: "+testAdd[1]);
        //Faca outros tests como o de get ou de remove

    }
}