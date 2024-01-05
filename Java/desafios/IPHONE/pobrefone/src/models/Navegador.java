package models;

public class Navegador extends Aplicativo {

    public Navegador(String nome) {
        super(nome);
    }

    private Integer qtdAbasAbertas = 0;

    public Integer getQtdAbasAbertas() {
        return qtdAbasAbertas;
    }

    public void setQtdAbasAbertas(Integer qtdAbasAbertas) {
        this.qtdAbasAbertas = qtdAbasAbertas;
    }
}
