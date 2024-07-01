package main.java.map.OperacoesBasicas;

import main.java.set.Pesquisa.AgendaContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosLucas {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatosLucas() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);

    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;

        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatosLucas agendaContatosLucas = new AgendaContatosLucas();
        agendaContatosLucas.adicionarContato("Camila",123456);
        agendaContatosLucas.adicionarContato("Camila",5665);
        agendaContatosLucas.adicionarContato("Camila Cavalcante",1111111);
        agendaContatosLucas.adicionarContato("Camila DIO",654987);
        agendaContatosLucas.adicionarContato("Maria Silva",1111111);
        agendaContatosLucas.adicionarContato("Camila",44444);

        agendaContatosLucas.exibirContatos();

        agendaContatosLucas.removerContato("Maria Silva");
        agendaContatosLucas.exibirContatos();

        System.out.println("O número é: " + agendaContatosLucas.pesquisarPorNome("Camila DIO"));

    }

}
