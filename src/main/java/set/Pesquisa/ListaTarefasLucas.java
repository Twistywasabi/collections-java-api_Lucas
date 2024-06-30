package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefasLucas {

    private Set<TarefasLucas> tarefasLucasSet;

    public ListaTarefasLucas() {
        this.tarefasLucasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasLucasSet.add(new TarefasLucas(descricao, false));
    }

    public void removerTarefa(String descricao){
        if(!tarefasLucasSet.isEmpty()){
            if(tarefasLucasSet.contains(descricao)){
                tarefasLucasSet.remove(descricao);
            }else{
                System.out.println("O conjunto está vazio");
            }
        }else{
            System.out.println("Lista está vazia !");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefasLucasSet);
    }

    public static void main(String[] args) {

        ListaTarefasLucas listaTarefasLucas = new ListaTarefasLucas();
        listaTarefasLucas.adicionarTarefa("Tarefa 1");
        listaTarefasLucas.adicionarTarefa("Tarefa 2");
        listaTarefasLucas.adicionarTarefa("Tarefa 3");
        listaTarefasLucas.adicionarTarefa("Tarefa 3");
        listaTarefasLucas.exibirTarefas();
        listaTarefasLucas.removerTarefa("Tarefa 3");
        listaTarefasLucas.exibirTarefas();
    }

}
