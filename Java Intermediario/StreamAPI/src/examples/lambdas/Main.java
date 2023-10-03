package examples.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        Rapper rapper1 = new Rapper("Drake - Yebbas", 200000);
        Rapper rapper2 = new Rapper("Look At me", 5071003);
        Rapper rapper3 = new Rapper("Tupac - Ambr", 1000000);
        Rapper rapper4 = new Rapper("Jocl Flores", 5000000);

        List<Rapper> listRappers = new ArrayList<>(Arrays.asList(rapper1, rapper2, rapper3, rapper4));
        
        try{
            List<Rapper> sortedRappers = Rapper.sortByViews(listRappers);
            System.out.println(sortedRappers.toString());

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}