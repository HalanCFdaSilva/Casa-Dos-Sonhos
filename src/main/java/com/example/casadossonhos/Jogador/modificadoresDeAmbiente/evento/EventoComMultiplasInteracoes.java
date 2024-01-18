package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.evento;

import java.util.ArrayList;

public class EventoComMultiplasInteracoes {
    private String nomeEvento;
    private ArrayList<Boolean> interacoes;

    public EventoComMultiplasInteracoes(String nomeEvento, int numeroInteracoes) {
        this.nomeEvento = nomeEvento;

        for (int i = 0; i <= numeroInteracoes; i++){
            Boolean interacao = false;
            this.interacoes.add(interacao);
        }
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void ativarInteracao(){

        for (boolean interacao:interacoes){
            if (!interacao){
                System.out.println("entrou");
                interacao = true;
                break;
            }
            System.out.println("nao entrou");
        }
    }

    public int getNumeroInteracoesAtivas(){
        int numeroInteracoesAtivas = 0;

        for (boolean interacao:interacoes){
            if (interacao){
                numeroInteracoesAtivas ++;

            }
        }
        return numeroInteracoesAtivas;

    }


}
