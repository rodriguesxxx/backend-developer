package examples.functionalInterface.binaryoperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> compras = Arrays.asList(100,200,40,1000);
        
        BinaryOperator<Integer> aPagar = (n1,n2) -> n1 + n2;

        int total = compras.stream()
            .reduce(0, aPagar);

        System.out.println("Total a pagar: "+total);
    }
}
