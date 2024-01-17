package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores;

import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.primeiraVez.InteracaoInicial;

import java.util.ArrayList;
import java.util.List;

public class AgregadorInteracaoInicial {
    ArrayList <InteracaoInicial> interacoes;

    public AgregadorInteracaoInicial() {
        this.interacoes = new ArrayList<>();

        ArrayList<String> nomesCenas = this.nomesCenas();

        nomesCenas.forEach(nome -> {
            InteracaoInicial interacaoInicial = new InteracaoInicial(nome);
            this.interacoes.add(interacaoInicial);
        });
    }

    private ArrayList<String> nomesCenas(){
        ArrayList<String> nomesCenas = new ArrayList<>();
        nomesCenas.add("SalaEmpalhada");
        nomesCenas.add("Porao");
        nomesCenas.add("Quarto");
        nomesCenas.add("SalaPatos");
        nomesCenas.add("SalaRGB");
        nomesCenas.add("SalaMorte");
        nomesCenas.add("SalaPatosSenha");
        nomesCenas.add("SalaVida");
        return nomesCenas;
    }

    public InteracaoInicial getInteracao(String nomeCena){
        InteracaoInicial interacaoInicial = null;
        for (InteracaoInicial interacao : this.interacoes){
            if (interacao.getNomeCena().equals(nomeCena)){
                interacaoInicial = interacao;
            }
        }
        return interacaoInicial;
    }
}
