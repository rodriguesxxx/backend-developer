import java.util.Collections;
import java.util.ArrayList;

class Aluno implements Comparable<Aluno>{
    public String nome;    
    public int nota;

    public Aluno(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString(){
        return "nome: "+this.nome+" / nota: "+this.nota;
    }

    @Override
    public int compareTo(Aluno aluno){
        return this.nome.compareTo(aluno.nome);
    }

}

public class AlunoMain {
    public static void main(String[] args){
        Aluno al1 = new Aluno("Daniel", 4);
        Aluno al2 = new Aluno("Josue", 10);

        ArrayList<Aluno> listAlunos = new ArrayList();
        listAlunos.add(al1);
        listAlunos.add(al2);
        Collections.sort(listAlunos);
        System.out.println(listAlunos);
    }
}
