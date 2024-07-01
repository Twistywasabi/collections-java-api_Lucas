package main.java.list.Ordenacao;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    //atributos

    private List<Integer> numerosInteirosList;

    public OrdenacaoNumeros() {
        this.numerosInteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosInteirosList.add(numero);
    };

    public void verListaNumerosinteiros(){
        System.out.println(numerosInteirosList);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAscendente = new ArrayList<>(this.numerosInteirosList);
        if(!numerosInteirosList.isEmpty()){
            Collections.sort(numeroAscendente);
            return numeroAscendente;
        } else {
            throw new RuntimeException("Lista está vazia");
            }
        };

    public List<Integer> ordenarDecrescente(){
        List<Integer> numeroAscendente = new ArrayList<>(this.numerosInteirosList);
        if(!numerosInteirosList.isEmpty()){
            numeroAscendente.sort(Collections.reverseOrder());
            return numeroAscendente;
        } else {
            throw new RuntimeException("Lista está vazia");
        }
    };



    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(30);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(25);
        ordenacaoNumeros.verListaNumerosinteiros();
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDecrescente());
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numerosInteirosList=" + numerosInteirosList +
                '}';
    }
}
