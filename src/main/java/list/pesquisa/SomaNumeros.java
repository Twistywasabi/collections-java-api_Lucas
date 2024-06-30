package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(new Integer(numero));
    };

    public void calcularSoma(){
        int soma = 0;
        for(Integer n : listaNumeros){
            soma += n;
        }
        System.out.println(soma);
    };

    public void encontrarMaiorNumero(){
        int maiorNumero = listaNumeros.get(0);
        for(Integer n : listaNumeros){
            if (n > maiorNumero){
                maiorNumero = n;
            }
        }
            System.out.println(maiorNumero);
    }

    public void encontrarMenorNumero(){
        int menorNumero = listaNumeros.get(0);
        for(Integer n : listaNumeros){
            if (n < menorNumero){
                menorNumero = n;
            }
        }
        System.out.println(menorNumero);
    }

    public void exibirNumeros () {
        System.out.println(listaNumeros);
    };


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(80);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(40);
        somaNumeros.exibirNumeros();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
        somaNumeros.calcularSoma();


    }

}
