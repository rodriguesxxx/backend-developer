package examples.lojafeliz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>(
            Arrays.asList(
                new Produto("Iphone13", 0.5, 8900),
                new Produto("Iphone14", 0.2, 11000),
                new Produto("Iphone15", 0.7, 15000)
            )
        );
            
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(produtos);
        try{
             System.out.println(carrinho.calculaPrecoTotal());

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
