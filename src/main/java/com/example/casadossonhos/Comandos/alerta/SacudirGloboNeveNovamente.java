package com.example.casadossonhos.Comandos.alerta;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

public class SacudirGloboNeveNovamente extends Alerta {
    @Override
    public void show() throws Exception {
        Alert alert = new Alert(Alert.AlertType.NONE);

        ButtonType confirmar = new ButtonType("Confirmar");
        alert.getButtonTypes().add(confirmar);

        Label segundaInteracao = new Label("Você sacode o globo de neve mais uma vez e a escrita na parede muda, agora está escrito: PARA, PORFAVOR!");
        Label terceiraInteracao = new Label("Você sacode o globo de neve novamente e um enorme grito se é ouvido por todo o comodo o vidro do globo se quebra " +
                " na sua mão, devidocom a ressonancia do grito. Não se será possivel sacudir o globo novamente");
    }
}
