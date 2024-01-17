package com.example.casadossonhos.Comandos.alerta.Estacoes;


import com.example.casadossonhos.Comandos.alerta.Alerta;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import javafx.scene.control.Alert;
import java.io.File;
import java.util.Scanner;

public class Estacao192 extends Alerta {
    public Estacao192(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void show() throws Exception {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        Scanner scanner = new Scanner(new File("src/main/resources/com/example/casadossonhos/Textos/Acasadossonhos/Entrada/Hall/segundo andar/Sala Rgb/Textos/3-3- Apertar botao 192.0.txt"));
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
