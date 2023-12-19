class Main {
    public static void main(String[] args){
        Pessoa p1 = new Fisica("Daniel", "Minas Gerais", "1234-2123-2332-09");
        Pessoa p2 = new Juridica("Joao", "Sao Paulo",  "12433.3223.2113/32");

        p1.pagarImposto();
        p2.pagarImposto();

    




    }
}
