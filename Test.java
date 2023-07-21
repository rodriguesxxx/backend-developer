import java.util.PriorityQueue;

class Test{
    public static void main(String[] args){
        PriorityQueue<Integer> numbersList = new PriorityQueue<>();
        String numbers = "3 1 4 2 5";
        for(String num : numbers.split(" ")){
            numbersList.add(Integer.parseInt(num));
        }
        String IloveJava = numbersList.toString();
        
        System.out.println(IloveJava.charAt(1));
        System.out.println(IloveJava.charAt(( IloveJava.length() - 2 )));
    }
}