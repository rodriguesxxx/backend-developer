package Collections.Exercicies.Grupo;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        Set<String[]> mascGrupo;
        Set<String[]> femGrupo;

        System.out.print("Informe quantos pacientes: ");
        int cont = sc.nextInt();
        sc.nextLine();

        System.out.println("\nInforme o nome e o sexo do paciente separados por um espaço");
        while(cont > 0){
            System.out.print("\n(nome (m/n)) >> ");
            String info = sc.nextLine();
            Grupo.addGroup(info.split(" "));
            cont--;
        }

        mascGrupo = Grupo.getGrupo("m");
        femGrupo = Grupo.getGrupo("f");

        System.out.println("MASCULINOS");
        for(String[] masc : mascGrupo){
            System.out.print("- Nome: " + masc[0] + " | sexo: " + masc[1] + "\n");
        }

        System.out.println("FEMININOS");
        for(String[] fem : femGrupo){
            System.out.print("- Nome: " + fem[0] + " | sexo: " + fem[1] + "\n");
        }


    }
}
