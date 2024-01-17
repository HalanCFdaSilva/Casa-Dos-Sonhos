package com.example.casadossonhos.Comandos.alerta;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.io.File;
import java.util.Scanner;

public class SeLavarAlert extends Alerta{
    @Override
    public void show() throws Exception {
        Alert alert = new Alert(Alert.AlertType.NONE);
        Pane pane = new Pane();
        Label label = new Label();
        Scanner scanner = new Scanner(new File("src/main/resources/com/example/casadossonhos/Textos/Acasadossonhos/Entrada/Hall/segundo andar/Quarto/banheiro/Textos/3-1-Se Lavar(ALERT).txt"));
        String texto = "";
        while(scanner.hasNext()){
            texto= scanner.nextLine();
            if (texto.contains("[")){
                break;
            }
            label.setText(label.getText() + texto + "\n");

        }

        pane.getChildren().add(label);
        alert.setGraphic(pane);
        ButtonType buttonTypeOk = new ButtonType("OK", ButtonBar.ButtonData.FINISH);
        alert.getButtonTypes().add(buttonTypeOk);
        alert.setTitle("Lavar o rosto");
        alert.show();
    }
}
