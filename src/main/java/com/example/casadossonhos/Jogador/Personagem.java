package com.example.casadossonhos.Jogador;

import com.example.casadossonhos.Jogador.inventario.Inventario;
import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.AgregadorModificadores;
import com.example.casadossonhos.casa.CenaAtual.CenaAtual;
import javafx.stage.Stage;

public class Personagem {

    private final Inventario inventario;
    private  Integer fichas;

    public AgregadorModificadores getAgregadorModificadores() {
        return agregadorModificadores;
    }

    private AgregadorModificadores agregadorModificadores;
    private CenaAtual cenaAtual;

    private final Stage primaryStage;

    public Personagem(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.inventario = new Inventario();
        this.agregadorModificadores = new AgregadorModificadores();

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
