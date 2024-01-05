package examples.lambdas;

import java.util.List;

public class Rapper {
    private String name;
    private Integer qtyViews;

    public Rapper(String name, Integer qtyV){
        this.name = name;
        this.qtyViews = qtyV;
    }

    public static List<Rapper> sortByViews(List<Rapper> rappers) throws Exception{
        if(!rappers.isEmpty()){
            rappers.sort( (rap1, rap2) -> Integer.compare( rap1.getQtyViews(), rap2.getQtyViews() ));
            return rappers;
        }
        throw new Exception("A lista está vazia");
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQtyViews() {
        return this.qtyViews;
    }

    public void setQtyViews(Integer qtyViews) {
        this.qtyViews = qtyViews;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", qtyViews='" + getQtyViews() + "'" +
            "}";
    }


}
