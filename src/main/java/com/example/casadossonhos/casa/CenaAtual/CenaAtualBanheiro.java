package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.Quarto;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro.Banheiro;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro.EspelhoBanheiro;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro.PiaBanheiro;

public enum CenaAtualBanheiro implements CenaAtual{

    BANHEIRO,
    BANHEIRA,
    ESPELHO,
    PIA,
    ARMARIO_PIA_BANHEIRO,
    ARMARIO_ESPELHO_BANHEIRO;


    public Cena cenaAnterior(Personagem personagem) {

        switch ((CenaAtualBanheiro)personagem.getCenaAtual()){
            case PIA,ESPELHO,BANHEIRA: return new Banheiro(personagem);

            case BANHEIRO: return new Quarto(personagem);

            case ARMARIO_PIA_BANHEIRO: return new PiaBanheiro(personagem);

            case ARMARIO_ESPELHO_BANHEIRO: return new EspelhoBanheiro(personagem);

            default: return null;
        }


    }

    @Override
    public String modificadorAmbienteTexto(Personagem personagem, String enderecoTexto) {
        switch ((CenaAtualBanheiro)personagem.getCenaAtual()){

            default: return enderecoTexto;
        }
    }
}
