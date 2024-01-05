package DesafioControleFluxo.services;

import DesafioControleFluxo.models.Contador;
import DesafioControleFluxo.exceptions.ParametrosInvalidosException;

public class ContadorService {
    
    public static void contar(Contador contador){
        try{
            if(parametrosValidos(contador)){
                int contagem = contador.getParametro2() - contador.getParametro1();
                for(int x = 1; x <= contagem; x++){
                    System.out.println(x);
                }
            }
        } catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
        
    }

    private static Boolean parametrosValidos(Contador contador) throws ParametrosInvalidosException{
        if(contador.getParametro1() > contador.getParametro2()){
            throw new ParametrosInvalidosException("O primeiro parametro deve ser menor que o segundo");
        }
        return true;
    }

}
