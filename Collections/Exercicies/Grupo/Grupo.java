package Collections.Exercicies.Grupo;

import java.util.Set;
import java.util.HashSet;

public class Grupo {

    private static Set<String[]> masculinos = new HashSet<>();
    private static Set<String[]> femininos = new HashSet<>();

    public Grupo(){}

    public static boolean addGroup(String[] infos){
        
        try {
            if(whatGroup(infos).equals("m")) {
                masculinos.add(infos);
            }
            else {
                femininos.add(infos);
            }
            
            return true;
        }
        catch(Exception e) {
            return false;
        } 
        
    }

    private static  String whatGroup(String[] infos){
        return infos[1].toLowerCase();    
    }

    public static Set<String[]> getGrupo(String abv){
        if(abv.equals("m")){
            return masculinos;
        }  
        return femininos;
    }
}
