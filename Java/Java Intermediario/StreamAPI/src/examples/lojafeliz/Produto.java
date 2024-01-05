package examples.lojafeliz;

public class Produto {
    private String nome;
    private double juros;
    private double preco;

    public Produto(String nome, double juros, double preco) {
        this.nome = nome;
        this.juros = juros;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
