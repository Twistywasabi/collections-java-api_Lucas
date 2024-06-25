package main.java.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();

    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    };

    public int obterNumeroTotalItens(){
        return itemList.size();
    }

    public void obterDescricaoItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("O número de itens é: " + carrinhoDeCompras.obterNumeroTotalItens());
        carrinhoDeCompras.adicionarItem("Pão",10.50,5);
        System.out.println("O número de itens é: " + carrinhoDeCompras.obterNumeroTotalItens());
        carrinhoDeCompras.obterDescricaoItens();
        carrinhoDeCompras.adicionarItem("Queijo",15.77,1);
        carrinhoDeCompras.adicionarItem("Manteiga",78,100);
        carrinhoDeCompras.obterDescricaoItens();
        carrinhoDeCompras.removerItem("queijo");
        carrinhoDeCompras.obterDescricaoItens();
        System.out.println("O número de itens é: " + carrinhoDeCompras.obterNumeroTotalItens());

    }

}
