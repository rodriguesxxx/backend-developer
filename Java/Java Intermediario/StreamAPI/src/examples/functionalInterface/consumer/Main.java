package examples.functionalInterface.consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = Arrays.asList(new Animal("Mel Dalila"), new Animal("Delicia"), new Animal("Angel"));
        
        animais.stream()
        .filter(animal -> animal.nome.length() > 5)
        .forEach(animal -> System.out.println(animal.nome));

    }
}
