package models;

public class Telefone {
    private String nome;
    private String marca;
    private Navegador firefox;
    private ReprodutorMusical ytMusic;

    private Boolean estaLigado = false;

    public Telefone(String nome, String marca, Navegador firefox, ReprodutorMusical ytMusic) {
        this.nome = nome;
        this.marca = marca;
        this.firefox = firefox;
        this.ytMusic = ytMusic;
    }

    public Boolean getEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(Boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Navegador getFirefox() {
        return firefox;
    }

    public void setFirefox(Navegador firefox) {
        this.firefox = firefox;
    }

    public ReprodutorMusical getYtMusic() {
        return ytMusic;
    }

    public void setYtMusic(ReprodutorMusical ytMusic) {
        this.ytMusic = ytMusic;
    }
}
