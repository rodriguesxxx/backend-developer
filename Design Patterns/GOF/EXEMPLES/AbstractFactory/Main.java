public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("A", true);
        Fabrica fabrica = getEscolaFabrica(aluno);
        Escola escola = fabrica.recuperarEscola(aluno.categoria);
        escola.iniciarAula();
    }

    private static Fabrica getEscolaFabrica(Aluno aluno) {
        if(aluno.hasTecnico) return new SuperiorFabrica();
        else return new TecnicoFabrica(); 
    }
}
