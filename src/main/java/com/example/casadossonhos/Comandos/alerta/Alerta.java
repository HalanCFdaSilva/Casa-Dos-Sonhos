package com.example.casadossonhos.Comandos.alerta;

import com.example.casadossonhos.Jogador.Personagem;
import javafx.scene.layout.Pane;


public abstract class Alerta  implements AtivaCenaInterface{
    private Personagem personagem;

    public Alerta(Personagem personagem) {
        this.personagem = personagem;
    }

    public Alerta(){}

    public Personagem getPersonagem() {
        return personagem;
    }
}
