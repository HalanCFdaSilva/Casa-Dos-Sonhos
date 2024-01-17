package com.example.casadossonhos.Comandos.alerta;


import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.ArmarioQuarto;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;



public class QuebrarGloboDeNeve extends Alerta {
    public QuebrarGloboDeNeve(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void show() throws Exception {

        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("Quebrar Globo De Neve");

        Label text1 = new Label("Você arremessa o globo de neve contra a parede fazendo o quebrar.\n Cacos de vidro voam para todos os lados, a fita cassete cai no chão.");
        alert.setHeaderText( text1.getText());

        Pane pane = new Pane();
        Label text2 = new Label("Oque você deseja fazer?");
        text2.setStyle("-fx-font-weight: bold");
        pane.getChildren().add(text2);
        alert.setGraphic(pane);

        ButtonType buttonTypePegar = new ButtonType("Pegar a fita Cassete");
        alert.getButtonTypes().add(buttonTypePegar);
        ButtonType buttonTypeCancelar = new ButtonType("Deixar fita Cassete", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().add(buttonTypeCancelar);

        alert.setOnCloseRequest(ActionEvent -> {
            try {
                ArmarioQuarto armarioQuarto = new ArmarioQuarto(this.getPersonagem());
                armarioQuarto.start();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });



        alert.showAndWait().ifPresent(buttonType -> {
            if (buttonType == buttonTypePegar){
                this.getPersonagem().getInventario().pegarItem("Fita Cassete");
            }
        });

    }
}
