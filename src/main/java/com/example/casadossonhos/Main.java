package com.example.casadossonhos;

import com.example.casadossonhos.Comandos.alerta.AlertaSenhaPatos;
import com.example.casadossonhos.Comandos.alerta.AlertaSintonizadorRadio;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.entrada.cenas.Entrada;
import com.example.casadossonhos.casa.entrada.hall.mezanino.salaPatos.SalaPatos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.FileNotFoundException;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 600,400);



        Button iniciar = new Button("IniciarJogo");
        iniciar.setLayoutY(294);
        iniciar.setLayoutX(300);
        iniciar.setPrefWidth(136);
        iniciar.setPrefHeight(54);
        iniciar.setOnAction(ActionEvent -> {
            Entrada entrada = new Entrada(new Personagem(stage));
            try {
                entrada.start();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Label label = new Label();
        label.setWrapText(true);
        label.setLayoutY(27);
        label.setLayoutX(51);
        label.setPrefHeight(246);
        label.setPrefWidth(496);

        pane.getChildren().addAll(iniciar, label);
        stage.setScene(scene);
        stage.setTitle("A casa dos Sonhos");
        stage.show();




    }

    public static void main(java.lang.String[] args) {
        launch();
    }
}
