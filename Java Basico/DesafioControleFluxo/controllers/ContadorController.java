package DesafioControleFluxo.controllers;

import java.util.Scanner;
import DesafioControleFluxo.models.Contador;
import DesafioControleFluxo.services.ContadorService;

public class ContadorController {
    
    private Scanner sc = new Scanner(System.in);

    public void init(){
        System.out.println("Seja bem vindo(a)!!!"); 
        Contador contador = inputParametros();
        fazerContagem(contador);
   }

   private Contador inputParametros(){
        System.out.println("Informe os parametros(logo apos informar o valor, der enter):");
        return new Contador(sc.nextInt(), sc.nextInt());   
    }

    private void fazerContagem(Contador contador){
        ContadorService.contar(contador);
    }

}
