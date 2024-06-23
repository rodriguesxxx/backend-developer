public class TecnicoFabrica extends Fabrica {
    @Override
    public Escola recuperarEscola(String categoria) {
        switch (categoria) {
            case "A":
                return new Matematica("Fundamentos da Matemática", 40, TurnoEnum.MATUTINO);                
            case "B":
                return new Informatica("Informática Básica", 30, TurnoEnum.VESPETINO);
            default:
                System.out.println("Categoia não encontrada");
                return null;
        }
    }

}
