package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.evento;

public class Evento {
    
    private String nomeEvento;
    private boolean ativo;

    public Evento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
        this.ativo = false;
    }

    public void ativar(){
        this.ativo = true;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
