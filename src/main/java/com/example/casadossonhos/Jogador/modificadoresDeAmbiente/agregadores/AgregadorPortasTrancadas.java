package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores;

import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.portaTrancada.PortaTrancada;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class AgregadorPortasTrancadas {

    ArrayList<PortaTrancada> portasTrancadas;

    public AgregadorPortasTrancadas() {

        this.portasTrancadas = new ArrayList<>();

        ArrayList<String> nomesSalas = new ArrayList<>();
        nomesSalas.add("Sala Vida");
        nomesSalas.add("Porao");
        nomesSalas.add("Sala Flores");

        nomesSalas.forEach(nomeSala -> {
            PortaTrancada portaTrancada = new PortaTrancada(nomeSala);
            this.portasTrancadas.add(portaTrancada);

        });
    }

    public PortaTrancada acharPorta(String nomeSalaProcurada){
        AtomicReference<PortaTrancada> portaAchada = new AtomicReference<>(new PortaTrancada("sem nome"));

        this.portasTrancadas.forEach(portaTrancada -> {
            if (portaTrancada.confirmarPorta(nomeSalaProcurada)){
                portaAchada.set(portaTrancada);
            }
        });

        return portaAchada.get();


    }
}
