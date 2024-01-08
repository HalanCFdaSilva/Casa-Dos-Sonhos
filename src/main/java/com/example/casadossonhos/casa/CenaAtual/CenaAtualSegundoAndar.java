package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;

public enum CenaAtualSegundoAndar implements CenaAtual {
    SEGUNDO_ANDAR;

    @Override
    public Cena cenaAnterior(Personagem personagem) {
        if (personagem.getCenaAtual().equals(SEGUNDO_ANDAR)){
            return new Hall(personagem);
        }else {
            return null;
        }
    }

    @Override
    public String modificadorAmbienteTexto(Personagem personagem, String enderecoTexto) {
        switch ((CenaAtualSegundoAndar) personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }
}
