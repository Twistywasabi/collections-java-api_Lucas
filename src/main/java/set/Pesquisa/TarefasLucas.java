package main.java.set.Pesquisa;

import java.util.Objects;

public class TarefasLucas {

    //atributos

    private String descricao;

    private boolean concluido;

    public TarefasLucas(String descricao, boolean concluido) {
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarefasLucas that = (TarefasLucas) o;
        return Objects.equals(getDescricao(), that.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "TarefasLucas{" +
                "descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                '}';
    }
}
