package controllers;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import models.Conta;

public class ContaTerminalController {
    
    private Scanner sc = new Scanner(System.in);

    public void init(){
        
        String output = "Olá, seja bem vindo!\n"
            + "1 - Criar conta\n"
            + "Escolha: "
        ;
        
        System.out.print(output);
        try{            
            int choice = sc.nextInt();
            switch(choice){
                
                case 1:
                    System.out.println(createAccount());
                    break;

                default:
                    System.out.println("invalid choice!!!");
                    init();
            }
        } catch(Exception e){
            e.getMessage();
        }

    }

    private Conta createAccount(){

        String[] requireInputValues = new String[] {"Nome", "Agencia", "Numero"};
        List<String> values = new ArrayList<>();

        sc.nextLine();
        for(String requireInputValue : requireInputValues){   
            System.out.print("informe o ".concat(requireInputValue) +": ");
            values.add( sc.nextLine() );
        }

        Conta newConta = new Conta( 
            Integer.valueOf(values.get(2)) , //numero
            values.get(1), //agencia
            values.get(0) //nome
        );

        return newConta;
            
    }
}
