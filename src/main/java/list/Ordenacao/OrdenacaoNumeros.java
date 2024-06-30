/*package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer>{

    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(new Integer(numero));
    };

    public List<Integer> ordemAscendente(){
        List<Integer> listaNumeroAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(listaNumeroAscendente, new ComparatorAscendente());
        return listaNumeroAscendente;

    };

    public List<Integer> ordemDescendente(){
        List<Integer> listaNumeroDescendente = new ArrayList<>(listaNumeros);
        Collections.sort(listaNumeroDescendente);
        return listaNumeroDescendente;

    };



    class ComparatorAscendente implements Comparator<Integer>{
        @Override
        public int compare(Integer i1, Integer i2) {
            return Integer.compare(i1, i2);
        }
    }

    @Override
    public int compareTo(Integer i){
        return Integer.compare(listaNumeros, i);
    };

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumerosCorrigidos ordenacaoNumeros = new OrdenacaoNumerosCorrigidos();
        ordenacaoNumeros.adicionarNumero(-30);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(10);
        System.out.println(ordenacaoNumeros.listaNumeros);
        System.out.println(ordenacaoNumeros.ordemAscendente());
    }

}
*/