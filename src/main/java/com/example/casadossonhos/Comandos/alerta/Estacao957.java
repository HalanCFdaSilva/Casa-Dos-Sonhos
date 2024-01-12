package com.example.casadossonhos.Comandos.alerta;

import com.example.casadossonhos.Comandos.alerta.Alerta;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import javafx.scene.control.Alert;

import java.io.File;
import java.util.Scanner;

public class Estacao957 extends Alerta {
    public Estacao957(Cena cena) {
        super(cena);
    }


    @Override
    public void show() throws Exception {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        Scanner scanner = new Scanner(new File("src/main/resources/com/example/casadossonhos/Textos/Acasadossonhos/Entrada/Hall/segundo andar/Sala Rgb/Textos/_3-2-Apertar botão 95.7.txt"));
        String texto ="";
        while (scanner.hasNext()){
            texto += scanner.nextLine();
            if (scanner.hasNext()){
                texto +="\n";
            }
        }
        alert.setContentText(texto);
        alert.show();
    }
}
