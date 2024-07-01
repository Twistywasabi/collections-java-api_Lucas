package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutosLucas {

    //atributo

    private Map<Long, ProdutoLucas> estoqueProdutosMap;

    public EstoqueProdutosLucas() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new ProdutoLucas(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    };

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for(ProdutoLucas p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();

            }
        }
        return valorTotalEstoque;
    };

    public ProdutoLucas obterProdutoMaisCaro(){
        ProdutoLucas produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()){
            for(ProdutoLucas p: estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            };
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutosLucas estoque = new EstoqueProdutosLucas();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoque.adicionarProduto(8L, "Produto D", 2, 20.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("produto mais caro: " + estoque.obterProdutoMaisCaro());

    }


}
