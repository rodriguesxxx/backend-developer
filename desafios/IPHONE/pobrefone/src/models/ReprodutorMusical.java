package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReprodutorMusical extends Aplicativo{
    private final List<String> musicas = Arrays.asList("Deixa eu botar o boneco", "Runaway");

    public ReprodutorMusical(String nome) {
        super(nome);
    }

    private Boolean estaTocandoMusica = false;

    public Boolean getEstaTocandoMusica() {
        return estaTocandoMusica;
    }

    public void setEstaTocandoMusica(Boolean estaTocandoMusica) {
        this.estaTocandoMusica = estaTocandoMusica;
    }
}
