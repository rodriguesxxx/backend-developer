class Fisica extends Pessoa {

    String cpf;

    public Fisica(String nome, String estado, String cpf) {
        super(nome, estado);
        this.cpf = cpf;
    }

    @Override
    public void pagarImposto(){ 
        System.out.println("Pagando impostos para uma pessoa jurídica, com CPF: " + this.cpf);
    }

}

