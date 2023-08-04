
class Juridica extends Pessoa {

    String cnpj;

    public Juridica(String nome, String estado, String cnpj) {
        super(nome, cnpj);
        this.cnpj = cnpj;
    }

    @Override
    public void pagarImposto(){ 
        System.out.println("Pagando impostos para uma pessoa jurídica, com CNPJ: " + this.cnpj);
    }

}
