package com.example.casadossonhos.Comandos.alerta;

import com.example.casadossonhos.casa.Cena;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class AlertaMorte {
    public static void alertaVidaInfinita(Cena cena) throws InterruptedException {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setX(700);
        alerta.setY(250);
        alerta.setTitle("Morreu?");
        Label label = new Label("VOCÊ MORREU!");
        Pane pane = new Pane(label);
        alerta.setGraphic(pane);
        alerta.show();
        alerta.setOnCloseRequest(ActionEvent -> {
            try {
                cena.start();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

    }

}
