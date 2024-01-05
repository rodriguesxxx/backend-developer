package DesafioControleFluxo.models;

public class Contador {

    private int parametro1;
    private int parametro2;

    public Contador(int parametro1, int parametro2){
        this.setParametro1(parametro1);
        this.setParametro2(parametro2);
    }
    

    /**
     * @return int return the parametro1
     */
    public int getParametro1() {
        return this.parametro1;
    }

    /**
     * @param parametro1 the parametro1 to set
     */
    public void setParametro1(int parametro1) {
        this.parametro1 = parametro1;
    }

    /**
     * @return int return the parametro2
     */

    public int getParametro2() {
        return this.parametro2;
    }

    /**
     * @param parametro2 the parametro2 to set
     */
    public void setParametro2(int parametro2) {
        this.parametro2 = parametro2;
    }

    @Override
    public String toString() {
        return "{" +
            " parametro1='" + getParametro1() + "'" +
            ", parametro2='" + getParametro2() + "'" +
            "}";
    }

}
