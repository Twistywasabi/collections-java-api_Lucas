package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventosLucas {

    //atributo

    private Map<LocalDate, EventoLucas> eventoLucasMap;

    public AgendaEventosLucas() {
        this.eventoLucasMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //EventoLucas evento = new EventoLucas(nome, atracao);
        eventoLucasMap.put(data,new EventoLucas(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, EventoLucas> eventosTreeMap = new TreeMap<>(eventoLucasMap);
        System.out.println(eventosTreeMap);

    }


    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet = eventoLucasMap.keySet();
        Collection<EventoLucas> values = eventoLucasMap.values();*/
        //eventoLucasMap.get()

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        EventoLucas proximoEvento = null;
        System.out.println(dataAtual);
        Map<LocalDate, EventoLucas> eventosTreeMap = new TreeMap<>(eventoLucasMap);
        for(Map.Entry<LocalDate, EventoLucas> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventosLucas agendaEventosLucas = new AgendaEventosLucas();
        agendaEventosLucas.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracao 1");
        agendaEventosLucas.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
        agendaEventosLucas.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao 3");
        //agendaEventosLucas.adicionarEvento(LocalDate.of(2024, Month.JULY, 1), "Evento 4", "Atracao 4");
        //agendaEventosLucas.adicionarEvento(LocalDate.of(2024, Month.JULY, 2), "Evento 5", "Atracao 5");
        agendaEventosLucas.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 2), "Evento 6", "Atracao 6");

        agendaEventosLucas.exibirAgenda();

        agendaEventosLucas.obterProximoEvento();

    }


}
