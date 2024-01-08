package com.example.casadossonhos.Comandos.alerta;


import com.example.casadossonhos.casa.Cena;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.*;

import javafx.scene.layout.Pane;



public class AlertaSintonizadorRadio extends Alerta  {

    private String resultado;

    public AlertaSintonizadorRadio(Cena cena) {
        super(cena);
    }


    public void show() throws Exception {

        Pane pane = new Pane();

        Alert alert = new Alert(Alert.AlertType.NONE);

        alert.setResizable(true);
        alert.getDialogPane().setPrefSize(235, 330);




        alert.setGraphic(pane);
        ButtonType button1 = new ButtonType("Ok");
        ButtonType button2 = new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(button1,button2);




        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setLayoutX(90);
        textArea.setLayoutY(20);
        textArea.setPrefHeight(46);
        textArea.setPrefWidth(130);
        textArea.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        pane.getChildren().add(textArea);


        double yConfirmar = 14;
        double x = 21;
        double y = 74;
        int contadorBotoes = 0;
        for (int i = 1; i <= 9; i++){
            Button button = new Button(Integer.toString(i));
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
                if (textArea.getText().length() <= 4){
                    textArea.appendText(button.getText());
                }

            });

            pane.getChildren().add(button);
        }

        alert.showAndWait().ifPresent(buttonType -> {
            if(buttonType == button1){
                this.resultado = textArea.getText();
                System.out.println(resultado);

            }

        });


    }


}
