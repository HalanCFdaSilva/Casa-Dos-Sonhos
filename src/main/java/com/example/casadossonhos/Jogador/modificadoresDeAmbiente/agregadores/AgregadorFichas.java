package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores;

import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.evento.Evento;

import java.util.ArrayList;

public class AgregadorFichas {

    private ArrayList<Evento> fichasFliperama;

    public AgregadorFichas() {
        this.fichasFliperama = new ArrayList<>();

        ArrayList<String> nomeLocaisACriarEvento = this.nomesLocaisFichas();

        nomeLocaisACriarEvento.forEach(nomeLocal -> {
            Evento evento = new Evento(nomeLocal);
            evento.setAtivo(true);
            this.fichasFliperama.add(evento);
        });
    }

    private ArrayList<String> nomesLocaisFichas(){
        ArrayList nomeLocais = new ArrayList<>();
        nomeLocais.add("Banheira");

        return nomeLocais;

    }

    public boolean pegouFicha(String nomeLocal){
        for (Evento evento : this.fichasFliperama) {
            if (evento.getNomeEvento().equals(nomeLocal)) {
                return evento.isAtivo();
            }
        }
        System.out.println("ficha não achada");
        return false;

    }

    public void pegarFicha(String nomeLocal){
        for (Evento evento : this.fichasFliperama) {
            if (evento.getNomeEvento().equals(nomeLocal)) {
                evento.setAtivo(false);
            }
        }
        System.out.println("ficha não achada");
    }
}
