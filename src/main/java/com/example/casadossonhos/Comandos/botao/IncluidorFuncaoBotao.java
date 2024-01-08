package com.example.casadossonhos.Comandos.botao;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class IncluidorFuncaoBotao {

    private Button botao;
    private Personagem personagem;

    public IncluidorFuncaoBotao(Button botao, Personagem personagem) {
        this.botao = botao;
        this.personagem = personagem;
    }

    public void adicionar(Cena cena){


        if(this.checaPrimeiroAdicionar()){
            botao.setOnAction(ActionEvent -> {
                try {
                    cena.start();}
                catch (Exception e) {throw new RuntimeException(e);}
            });

        }else{
            EventHandler<ActionEvent> current = botao.getOnAction();
            botao.setOnAction(ActionEvent -> {
                try {
                    current.handle(ActionEvent);
                    cena.start();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }



    public void adicionar(String nomeDoqueAtivar, TiposDeAdicionar tipoAAdicionar){
        if (tipoAAdicionar.equals(TiposDeAdicionar.ITEM)){
            this.ativarItem(nomeDoqueAtivar);
        }
        if (tipoAAdicionar.equals(TiposDeAdicionar.PRIMEIRA_INTERACAO)){
            this.ativarInteracao(nomeDoqueAtivar);
        }
        if (tipoAAdicionar.equals(TiposDeAdicionar.EVENTO)){
            this.ativarEvento(nomeDoqueAtivar);
        }
    }

    private void ativarEvento(String nomeDoqueAtivar) {
        if(this.checaPrimeiroAdicionar()){
            botao.setOnAction(ActionEvent -> {
                try {personagem.getEventos().find(nomeDoqueAtivar).ativar();}
                catch (Exception e) {throw new RuntimeException(e);}
            });

        }else{
            EventHandler<ActionEvent> current = botao.getOnAction();
            botao.setOnAction(ActionEvent -> {
                try {
                    current.handle(ActionEvent);
                    personagem.getEventos().find(nomeDoqueAtivar).ativar();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    private void ativarInteracao(String nomeDoqueAtivar) {

        if(this.checaPrimeiroAdicionar()){
            botao.setOnAction(ActionEvent -> {
                try {personagem.getInteracoes().getInteracao(nomeDoqueAtivar).primeiraInteracao();}
                catch (Exception e) {throw new RuntimeException(e);}
            });

        }else{
            EventHandler<ActionEvent> current = botao.getOnAction();
            botao.setOnAction(ActionEvent -> {
                try {
                    current.handle(ActionEvent);
                    personagem.getInteracoes().getInteracao(nomeDoqueAtivar).primeiraInteracao();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    private void ativarItem(String nomeDoqueAtivar) {

        if(this.checaPrimeiroAdicionar()){
            botao.setOnAction(ActionEvent -> {
                try {personagem.getInventario().pegarItem(nomeDoqueAtivar);}
                catch (Exception e) {throw new RuntimeException(e);}
            });

        }else{
            EventHandler<ActionEvent> current = botao.getOnAction();
            botao.setOnAction(ActionEvent -> {
                try {
                    current.handle(ActionEvent);
                    personagem.getInventario().pegarItem(nomeDoqueAtivar);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }

    private boolean checaPrimeiroAdicionar() {
        if (this.botao.getOnAction() == null){
            return true;
        }

        return false;
    }
}