package com.example.casadossonhos.Comandos.alerta;


import com.example.casadossonhos.Comandos.alerta.Checador.ChecadorRadio;
import com.example.casadossonhos.Jogador.Personagem;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.SnapshotResult;
import javafx.scene.control.*;

import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class AlertaSintonizadorRadio extends Alerta  {

    private String resultado;
    private int numero;
    private Pane pane;

    public AlertaSintonizadorRadio(Personagem personagem) {
        super(personagem);
        numero = -1;
        this.pane = new Pane();
    }


    public void show() throws Exception {

        Alert alert = new Alert(Alert.AlertType.NONE);

        alert.setResizable(true);
        alert.getDialogPane().setPrefSize(235, 355);



        alert.getDialogPane().setGraphic(pane);

        ButtonType button1 = new ButtonType("Sintonizar");
        ButtonType button2 = new ButtonType("Voltar", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().addAll(button1,button2);

        Label label = this.criarLabel();
        this.criarBotao(label);



        alert.showAndWait().ifPresent(buttonType -> {
            if(buttonType == button1){
                this.resultado = label.getText();

                System.out.println(resultado);
                ChecadorRadio checadorRadio = new ChecadorRadio(this.getPersonagem());
                checadorRadio.checarNumeroRadio(this.resultado);


            }

        });


    }

    private void criarBotao(Label label) {

        double x = 21;
        double y = 74;
        int contadorBotoes = 0;
        for (int i = 1; i <=12 ; i++){
            Button button = new Button();
            if (i <= 9 ){
                button.setText(Integer.toString(i));
            }else {
                if (x ==21){
                    button.setText("<");
                }

                if (x ==21 +70 ){
                    button.setText("0");
                }

                if (x== 21 +(70*2)){
                    button.setText(">");
                }



            }
            button.setPrefHeight(53);
            button.setPrefWidth(63);
            button.setLayoutY(y);
            button.setLayoutX(x);
            contadorBotoes++;

            x += 70;

            if (contadorBotoes == 3){
                y += 60;
                x = 21;
                contadorBotoes = 0;
            }


            button.setOnAction(ActionEvent -> {
                if (button.getText().equals("<")||button.getText().equals(">")){
                    if (button.getText().equals("<")){
                        if (numero <= 0){
                            numero = 4;
                        }else {
                            numero --;
                        }
                        if (label.getText().charAt(numero) == '.'){
                            numero--;
                        }
                    }else {
                        if (numero == 4){
                            numero = 0;
                        }else {
                            numero++;
                        }
                    }

                }else {
                    if (numero == 4){
                        numero = 0;
                    }else {

                        numero++;
                    }

                    if (label.getText().charAt(numero) == '.'){
                        numero++;
                    }
                    String newLabel = label.getText().substring(0,numero) + button.getText() + label.getText().substring(numero +1);
                    label.setText(newLabel);


                }

            });



            pane.getChildren().add(button);
        }
    }

    private Label criarLabel() {
        Label label = new Label("000.0");
        label.setFont(Font.font("Consolas", FontWeight.BOLD,45));
        label.setLayoutX(50);
        label.setLayoutY(5);
        label.setPrefHeight(46);
        label.setPrefWidth(150);
        label.setAlignment(Pos.BASELINE_CENTER);
        BorderStroke borderStroke = new BorderStroke(Paint.valueOf("black"), BorderStrokeStyle.SOLID,new CornerRadii(2), BorderWidths.DEFAULT);
        Border border = new Border(borderStroke);
        label.setBorder(border);
        pane.getChildren().add(label);
        return label;
    }


}
