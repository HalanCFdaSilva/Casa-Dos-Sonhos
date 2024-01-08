package com.example.casadossonhos.Comandos.alerta;

import com.example.casadossonhos.casa.Cena;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class AlertaSystemShock extends Alerta{



    public void show(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Pane pane = new Pane();
        Label label = new Label("Oh, parece que desafios dificeis como esse são muito dificeis para vermes como você");
        pane.getChildren().add(label);
        alert.setGraphic(pane);
        alert.setTitle("Shodan:");
        alert.show();
    }
}
