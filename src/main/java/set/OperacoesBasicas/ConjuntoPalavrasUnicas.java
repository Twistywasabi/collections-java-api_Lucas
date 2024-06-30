package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    //atributo
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasSet=" + palavrasSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(palavrasSet, that.palavrasSet);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavrasSet);
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    };

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    };

    public void removerPalavra(String palavra){
        palavrasSet.remove(palavra);
    }

    public void verificarPalavra(String palavra){
        for (String s : palavrasSet){
            if(s == palavra ){
                System.out.println("True");
                break;
            }
        }
    };

    public static void main(String[] args) {
        ConjuntoPalavrasUnicasCorrigido conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicasCorrigido();
        conjuntoPalavrasUnicas.adicionarPalavra("Lucas");
        conjuntoPalavrasUnicas.adicionarPalavra("Lucas");
        conjuntoPalavrasUnicas.adicionarPalavra("Maria");
        conjuntoPalavrasUnicas.adicionarPalavra("Carlos");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Lucas");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("asdsadasd");
        conjuntoPalavrasUnicas.verificarPalavra("Maria");


    }

}
