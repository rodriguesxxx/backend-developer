abstract class Pessoa{
    private String nome;
    private String estado;
    
    public Pessoa(String nome, String estado){
        this.nome = nome;
        this.estado = estado;
    }
    
    public abstract void pagarImposto();


}