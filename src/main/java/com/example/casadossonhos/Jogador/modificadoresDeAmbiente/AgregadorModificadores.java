package com.example.casadossonhos.Jogador.modificadoresDeAmbiente;

import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores.AgregadorEventos;
import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores.AgregadorFichas;
import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores.AgregadorPortasTrancadas;
import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores.AgregadorInteracaoInicial;

public class AgregadorModificadores {

    private AgregadorPortasTrancadas agregadorPortasTrancadas;
    private AgregadorEventos agregadorEventos;
    private AgregadorInteracaoInicial agregadorInteracaoInicial;
    private AgregadorFichas agregadorFichas;

    public AgregadorModificadores() {
        this.agregadorEventos = new AgregadorEventos();
        this.agregadorInteracaoInicial = new AgregadorInteracaoInicial();
        this.agregadorPortasTrancadas = new AgregadorPortasTrancadas();
        this.agregadorFichas = new AgregadorFichas();
    }

    public AgregadorPortasTrancadas getAgregadorPortasTrancadas() {
        return agregadorPortasTrancadas;
    }

    public AgregadorEventos getAgregadorEventos() {
        return agregadorEventos;
    }

    public AgregadorInteracaoInicial getAgregadorInteracaoInicial() {
        return agregadorInteracaoInicial;
    }

    public AgregadorFichas getAgregadorFichas() {
        return this.agregadorFichas;
    }
}
