package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;

public enum CenaAtualEntrada implements CenaAtual {

    BATER_A_PORTA,
    CHAMAR_POR_ALGUEM,
    ENTRADA,
    ESPERAR_MAIS_UM_POUCO,
    ESPERAR_UM_POUCO,
    IR_EMBORA,
    OLHAR_JANELA,
    SE_APROXIMAR_DA_CASA;

    @Override
    public Cena cenaAnterior(Personagem personagem) {
        return null;
    }


}
