package main.java.map.Ordenacao;

public class EventoLucas {

    private String nome;

    private String atracao;

    public EventoLucas(String nome, String atracao){
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome () {return nome;}

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "EventoLucas{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
