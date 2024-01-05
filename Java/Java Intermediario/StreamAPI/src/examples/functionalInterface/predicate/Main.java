package examples.functionalInterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> idades = Arrays.asList(15,18,21,12);

        Predicate<Integer> maioresDeIdade = idade -> idade >= 18;
        
        idades.stream()
            .filter(maioresDeIdade)
            .forEach(idade -> System.out.println(idade));
    }
}
