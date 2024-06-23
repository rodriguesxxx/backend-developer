public class SuperiorFabrica extends Fabrica {
    @Override
    public Escola recuperarEscola(String categoria) {
        switch (categoria) {
            case "A":
                return new Matematica("Cálculo I", 15, TurnoEnum.MATUTINO);                
            case "B":
                return new Informatica("POO - Progranação Orientada a Objetos", 25, TurnoEnum.VESPETINO);
            default:
                System.out.println("Categoia não encontrada");
                return null;
        }
    }
}