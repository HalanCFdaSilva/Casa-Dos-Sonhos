package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.SegundoAndar;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaRGB.SalaRGB;

public enum CenaAtualRGB implements CenaAtual {
    PEGAR_EXTINTOR,
    SALA_RGB,
    OBJETO_NO_CHAO,
    RADIO;

    @Override
    public Cena cenaAnterior(Personagem personagem) {
        switch ((CenaAtualRGB)personagem.getCenaAtual()){
            case PEGAR_EXTINTOR: return new SalaRGB(personagem);
            case SALA_RGB: return new SegundoAndar(personagem);
            default: return null;
        }
    }

    @Override
    public String modificadorAmbienteTexto(Personagem personagem, String enderecoTexto) {
        switch ((CenaAtualRGB) personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }
}
