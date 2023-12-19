package Collections.Exercicies.Idade;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Person> person = new HashSet<>();

        for(int i = 0; i < 3; i++){
            
            System.out.print("name/age: ");
            String[] infoInput = sc.nextLine().split(" ");

            if(infoInput.length == 2){
            
                String name = infoInput[0];
                int age = Integer.parseInt(infoInput[1]);
                person.add( new Person(name, age) );

            } else {
            
                System.out.println("invalid input, try again");
                i--;
            }
        }
        
        System.out.print("Informe um nome para busca: ");
        String searchName = sc.nextLine();

        for( Person people : person ){
            
            if( people.getName().equalsIgnoreCase(searchName) ) {

                System.out.println(people.getAge());
                break;

            }
        }
        sc.close();

    }
}