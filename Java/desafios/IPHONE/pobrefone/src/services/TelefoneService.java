package services;

import models.Telefone;

public class TelefoneService {
    private Telefone telefone;

    public TelefoneService(Telefone telefone) {
        this.telefone = telefone;
    }

    public void ligarTelefone(){
        telefone.setEstaLigado(true);
        System.out.println("Telefone ligado.");
    }
    public void desligarTelefone(){
        telefone.setEstaLigado(false);
        System.out.println("Telefone desligado.");
    }
}
