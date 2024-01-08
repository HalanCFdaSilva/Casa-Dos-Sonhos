package com.example.casadossonhos.Comandos.botao;

import com.example.casadossonhos.Comandos.alerta.Alerta;
import com.example.casadossonhos.Comandos.alerta.AlertaSenhaPatos;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Botoes {

    private ArrayList <Button> botoes;
    private final Button  voltar;
    private Personagem personagem;


    public Botoes(String enderecoOpcoes)throws FileNotFoundException {

        this.botoes = new ArrayList<>();
        int layoutY = 160;
        if (!enderecoOpcoes.equals("Não possui")){
            Scanner scanner = new Scanner(new File(enderecoOpcoes));
            while (scanner.hasNext()){
                Button button = new Button(scanner.nextLine());
                button.setLayoutX(361);
                button.setLayoutY(layoutY);
                button.setPrefWidth(163);
                button.setPrefHeight(48);
                button.setWrapText(true);
                button.setTextAlignment(TextAlignment.CENTER);
                layoutY += 66;
                botoes.add(button);


            }
        }
        voltar = new Button("voltar");
        voltar.setLayoutX(361);
        this.voltar.setLayoutY(layoutY);
        voltar.setPrefWidth(163);

        voltar.setPrefHeight(48);
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Pane AtivarBotoes(Pane pane){

        this.botoes.forEach(button -> pane.getChildren().add(button));
        if (this.voltar.isVisible()){pane.getChildren().add(voltar);}
        return pane;
    }

    public void funcaoBotao(Cena cena, @NotNull String textoBotao){
        if(textoBotao.equals("Voltar")){
                IncluidorFuncaoBotao incluidor = new IncluidorFuncaoBotao(voltar,personagem);
                incluidor.adicionar(cena);
        }else {
            botoes.forEach(botao -> {


                if (botao.getText().equals(textoBotao)){
                   IncluidorFuncaoBotao incluidor = new IncluidorFuncaoBotao(botao,personagem);
                   incluidor.adicionar(cena);
                }

            });
        }

    }

    public Botoes criaAlerta(Alerta alerta, String textoBotao){
            botoes.forEach(botao -> {

                if (botao.getText().equals(textoBotao)){

                    botao.setOnAction(ActionEvent -> {

                        try {
                            alerta.show();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    });
                }

            });
        return this;

    }


    public Botoes pegarItem(@NotNull String textoBotao, String nomeItem){
        if(textoBotao.equals("Voltar")){
           IncluidorFuncaoBotao incluidor = new IncluidorFuncaoBotao(voltar,personagem);
           incluidor.adicionar(nomeItem,TiposDeAdicionar.ITEM);
        }else{
            botoes.forEach(botao -> {
                if (botao.getText().equals(textoBotao)){
                    IncluidorFuncaoBotao incluidor = new IncluidorFuncaoBotao(botao,personagem);
                    incluidor.adicionar(nomeItem,TiposDeAdicionar.ITEM);
                }
            });
        }

        return this;
    }

    public Botoes entrou(String nomePrimeiraInteracao, @NotNull String textoBotao) {
        if(textoBotao.equals("Voltar")){
            IncluidorFuncaoBotao incluidor = new IncluidorFuncaoBotao(voltar,personagem);
            incluidor.adicionar(nomePrimeiraInteracao,TiposDeAdicionar.PRIMEIRA_INTERACAO);
        }else{
            botoes.forEach(botao -> {
                if (botao.getText().equals(textoBotao)){
                    IncluidorFuncaoBotao incluidor = new IncluidorFuncaoBotao(botao,personagem);
                    incluidor.adicionar(nomePrimeiraInteracao,TiposDeAdicionar.PRIMEIRA_INTERACAO);
                }
            });
        }

        return this;
    }

    public void desativarVoltar(@NotNull Pane pane){
        this.voltar.setVisible(false);
        pane.getChildren().remove(this.voltar);
    }
    public void fimDeJogo(Stage stage) {
        this.voltar.setText("ENCERRAR");
        this.voltar.setOnAction(ActionEvent -> stage.close());

    }


}
