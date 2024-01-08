package com.example.casadossonhos.Comandos.alerta;

import com.example.casadossonhos.Comandos.alerta.Checador.ChecadorSenhaPatos;
import com.example.casadossonhos.casa.Cena;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class AlertaSenhaPatos extends Alerta{

    private final ArrayList<Button> botoes;
    private final ArrayList<Label> textos;

    private Alert alerta;
    private String senhaDigitada;

    public AlertaSenhaPatos(Cena cena) {
        super(cena);

        this.botoes = new ArrayList<>();
        this.textos = new ArrayList<>();
        int layoutX = 0;

        for (int i = 0; i<4; i++){

            Label label1 = new Label("0");
            label1.setLayoutX(layoutX);
            textos.add(label1);

            Button acao1 = new Button();
            acao1.setLayoutX(layoutX);
            acao1.setLayoutY(25);
            botoes.add(acao1);

            layoutX += 25;
        }








    }

    public void funcaoBotao(){
        int i = 0;
        for (Button button : botoes) {
            int finalI = i;
            botoes.get(i).setOnAction(ActionEvent -> {

                if (this.textos.get(finalI).getText().equals("9")) {
                    this.textos.get(finalI).setText("0");
                } else {
                    Integer numero = Integer.parseInt(this.textos.get(finalI).getText());
                    this.textos.get(finalI).setText(Integer.toString(numero + 1));
                }

            });
            i++;
        }
    }

    public void criarAlerta(){
        Pane pane = new Pane();


        alerta = new Alert(Alert.AlertType.NONE);
        alerta.getDialogPane().setId("alerta-Patos");


        botoes.forEach(button -> pane.getChildren().add(button));
        textos.forEach(label -> pane.getChildren().add(label));

        ButtonType but = new ButtonType("", ButtonBar.ButtonData.OK_DONE);
        alerta.getButtonTypes().add(but);
        Node button = alerta.getDialogPane().lookupButton(but);
        button.setId("button-type");


        alerta.setGraphic(pane);
        alerta.getDialogPane().getStylesheets().add("cssArchives/alert/alertaPatos.css");

        alerta.showAndWait().ifPresent(buttonType -> {
            if (buttonType == but) {
                this.salvarSenha();
                this.checarSenha(this.getCena());
                textos.forEach(label -> label.setText("0"));

            }
        });

    }

    public void show() throws InterruptedException {


        this.funcaoBotao();
        this.criarAlerta();




    }



    private void checarSenha(Cena cena) {
        ChecadorSenhaPatos checador = new ChecadorSenhaPatos(this.getSenhaDigitada(), cena);
        try {
            checador.checar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String getSenhaDigitada() {
        return this.senhaDigitada;
    }

    private void salvarSenha(){
        senhaDigitada = "";
        this.textos.forEach(label -> this.senhaDigitada += label.getText());

    }


}
