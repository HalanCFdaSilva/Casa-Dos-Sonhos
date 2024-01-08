package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.primeiraVez;

public class InteracaoInicial {

    private String nomeCena;
    private  boolean primeiraVez;

    public InteracaoInicial(String nomeCena) {
        this.nomeCena = nomeCena;
        this.primeiraVez = true;
    }

    public String getNomeCena() {
        return nomeCena;
    }

    public boolean isPrimeiraVez() {
        return primeiraVez;
    }

    public void primeiraInteracao(){
        this.primeiraVez = false;
    }
}
