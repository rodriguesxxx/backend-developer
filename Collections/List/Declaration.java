import java.util.List;
import java.util.ArrayList;

    class Declaration{

        public List<String> methodOne(){
            
            List<String> oneList = new ArrayList<>();
            
            return oneList;
        }

        public ArrayList<String> methodTwo(){
            
            ArrayList<String> twoList = new ArrayList();
            
            return twoList;
        }

        public static void main(String[] args){
            
            Declaration dcl = new Declaration();

            List<String> myListOne = dcl.methodOne(); //sim poderia fazer direto, mas qual é graca kkk

            ArrayList<String> myListTwo = dcl.methodTwo();

            myListOne.add("Teste 1");
            myListTwo.add("Teste 2");
            myListOne.add("Teste 3");
            myListTwo.add("Teste 4");

            System.out.println(myListOne.get(1));
            System.out.println(myListTwo);

        }

    }