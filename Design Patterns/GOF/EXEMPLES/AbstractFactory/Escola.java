public class Escola {
    
    protected String nome;
    protected Integer alunos;   
    protected TurnoEnum turno;

    public Escola(String nome, Integer alunos, TurnoEnum turno) {
        this.nome = nome;
        this.alunos = alunos;
        this.turno = turno;
    }

    public void iniciarAula() {
        System.out.printf("Escola: %s \n Alunos presentes: %d \n Turno: %s \n aula iniciada com sucesso !!!", this.nome, this.alunos, this.turno);
    }

    public String getNome() {
        return this.nome;
    }


    public Integer getAlunos() {
        return this.alunos;
    }


    public TurnoEnum getTurno() {
        return this.turno;
    }

}
