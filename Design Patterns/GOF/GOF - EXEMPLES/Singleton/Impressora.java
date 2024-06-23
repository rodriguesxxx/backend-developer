public final class Impressora{
    
    private static Impressora impressora;

    private Impressora(){}

    public static Impressora getInstance(){
        if(impressora == null){
            impressora = new Impressora();
        }   
        return impressora;
    }
}