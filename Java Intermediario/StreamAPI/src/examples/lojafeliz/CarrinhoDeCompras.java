package examples.lojafeliz;

import java.util.List;

public class CarrinhoDeCompras{
    private List<Produto> produtoList;

    public CarrinhoDeCompras(List<Produto> itens){
        this.produtoList = itens;
    }

    public double calculaPrecoTotal() throws Exception{
        
        if( !produtoList.isEmpty() ){
            return produtoList.stream()
                .mapToDouble( produto -> produto.getPreco() + (produto.getPreco() * produto.getJuros()) )
                .sum();
        }
        throw new Exception("A lista está vazia");
    }   
}
