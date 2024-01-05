package examples.functionalInterface.functionTR;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        List<Double> nums = Arrays.asList(3.0,5.0,7.0,9.0);
    
        Function<Double, Double> elevar = num -> Math.pow(num, 2);

        List<Double> nElevados = nums.stream()
            .map(elevar)
            .toList();

        nElevados.forEach(n -> System.out.println(n));    
    }
    
}
