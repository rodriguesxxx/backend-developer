public class Main {
    public static void main(String[] args) {
        BugerDirector bugerDirector = new BugerDirector();
        bugerDirector.setBuilder( new BugerBuilderMc() );
        System.out.println(bugerDirector.buildBuger());
    }   

}
