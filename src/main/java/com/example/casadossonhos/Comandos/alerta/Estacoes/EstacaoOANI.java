package com.example.casadossonhos.Comandos.alerta.Estacoes;

import com.example.casadossonhos.Comandos.alerta.Alerta;
import com.example.casadossonhos.Jogador.Personagem;


public class EstacaoOANI extends Alerta {
    public EstacaoOANI(Personagem personagem) {
        super(personagem);

    }

    @Override
    public void show() throws Exception {
        System.out.println("EstacaoAlien");
    }
}
