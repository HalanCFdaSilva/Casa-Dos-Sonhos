package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores;

import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.evento.Evento;

import java.util.ArrayList;

public class AgregadorInteracaoInicial {
    ArrayList <Evento> interacoes;

    public AgregadorInteracaoInicial() {
        this.interacoes = new ArrayList<>();

        ArrayList<String> nomesCenas = this.nomesCenas();

        nomesCenas.forEach(nome -> {
            Evento interacaoInicial = new Evento(nome);
            interacaoInicial.setAtivo(true);
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

   public boolean isPrimeiraVez(String nomeCena){
        boolean achouInteracao = false;
        boolean primeiraVez = false;
        for (Evento interacaoInicial: this.interacoes){
            if(interacaoInicial.getNomeEvento().equals(nomeCena)){
                primeiraVez = interacaoInicial.isAtivo();
                achouInteracao = true;
            }
        }

        if (!achouInteracao){
            System.out.println("não achou evento");
        }
       return primeiraVez;
   }

   public void primeiraInteracao(String nomeCena){
           this.interacoes.forEach(interacao -> {
               if (interacao.getNomeEvento().equals(nomeCena)){
                   interacao.setAtivo(false);
               }
           });

   }
}
