package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores;

import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.evento.Evento;
import java.util.ArrayList;


public class AgregadorPortasTrancadas {

    ArrayList<Evento> portasTrancadas;

    public AgregadorPortasTrancadas() {

        this.portasTrancadas = new ArrayList<>();

        ArrayList<String> nomesSalas = this.nomesPortas();


        nomesSalas.forEach(nomeSala -> {
            Evento portaTrancada = new Evento(nomeSala);
            this.portasTrancadas.add(portaTrancada);

        });
    }

    private ArrayList<String> nomesPortas(){
        ArrayList<String> nomesSalas = new ArrayList<>();
        nomesSalas.add("Sala Vida");
        nomesSalas.add("Porao");
        nomesSalas.add("Sala Flores");

        return nomesSalas;
    }

    public boolean isDestrancada(String nomeCena){

        Boolean destrancada= null;
        for (Evento evento : this.portasTrancadas){
            if (evento.getNomeEvento().equals(nomeCena)){
                destrancada = evento.isAtivo();
                break;
            }
        }
        if (destrancada == null){
            System.out.println("não achou cena");
        }
        return destrancada.booleanValue();
    }

    public void destrancar(String nomeCena){

        for (Evento evento : this.portasTrancadas){
            if (evento.getNomeEvento().equals(nomeCena)){

                evento.setAtivo(true);
                break;
            }
        }

    }
}
