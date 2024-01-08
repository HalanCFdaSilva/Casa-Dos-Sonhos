package com.example.casadossonhos.Jogador;

import com.example.casadossonhos.Jogador.inventario.Inventario;
import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.eventos.AgregadorEventos;
import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.primeiraVez.AgregadorInteracaoInicial;
import com.example.casadossonhos.casa.CenaAtual.CenaAtual;
import javafx.stage.Stage;

public class Personagem {

    private final Inventario inventario;
    private  Integer fichas;
    private AgregadorEventos eventos;
    private AgregadorInteracaoInicial interacoes;
    private CenaAtual cenaAtual;

    private final Stage primaryStage;

    public Personagem(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.inventario = new Inventario();
        this.eventos = new AgregadorEventos();
        this.interacoes = new AgregadorInteracaoInicial();

    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public CenaAtual getCenaAtual() {
        return cenaAtual;
    }

    public void setCenaAtual(CenaAtual cenaAtual) {
        this.cenaAtual = cenaAtual;
    }

    public AgregadorInteracaoInicial getInteracoes() {
        return interacoes;
    }
    public AgregadorEventos getEventos(){
        return eventos;
    }
    public Inventario getInventario() {
        return inventario;
    }

    public Integer getFichas() {
        return fichas;
    }

    public void achouFicha() {
        this.fichas +=1;
    }

    public void morreu(Boolean alien){
        if (alien){
            this.fichas -=1;
        }
    }


}
