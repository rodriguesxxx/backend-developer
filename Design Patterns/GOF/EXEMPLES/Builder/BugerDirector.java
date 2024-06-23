public class BugerDirector {
    
    private BugerBuilder bugerBuilder;

    public void setBuilder(BugerBuilder bugerBuilder){
        this.bugerBuilder = bugerBuilder;
    }

    public Buger buildBuger(){
        bugerBuilder.buildName();
        return bugerBuilder.buger;
    }
}
