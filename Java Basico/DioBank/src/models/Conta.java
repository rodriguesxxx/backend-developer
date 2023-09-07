package models;
import java.util.Objects;

public class Conta {
    
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    
    public Conta(){}

    public Conta(Integer numero, String agencia, String nomeCliente){
        setNumero(numero);
        setAgencia(agencia);
        setNomeCliente(nomeCliente);
        setSaldo(0.0);
    }
    
    

    @Override
    public String toString() {
        
        return "Olá ".concat(getNomeCliente()) 
            + ", obrigado por criar um conta em nosso banco, sua agencia é ".concat(getAgencia()) 
            + ", conta ".concat( getNumero().toString() )
            + " seu saldo atual é de ".concat(getSaldo().toString())
            + " R$";
    }
    

    /**
     * @return Integer return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return String return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return String return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return Double return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
