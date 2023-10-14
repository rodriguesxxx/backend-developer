package examples.functionalInterface.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class HelloWorld {
    public static void main(String[] args) {
        Supplier<String> msg = () -> "Hello World!!";
        List<String> listMsg = Stream.generate(msg).limit(10).toList();
        listMsg.forEach(m -> System.out.println(m));
    }
}
