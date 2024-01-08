package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.mezanino.quarto.Quarto;
import com.example.casadossonhos.casa.entrada.hall.mezanino.quarto.banheiro.Banheiro;
import com.example.casadossonhos.casa.entrada.hall.mezanino.quarto.banheiro.EspelhoBanheiro;
import com.example.casadossonhos.casa.entrada.hall.mezanino.quarto.banheiro.PiaBanheiro;

public enum CenaAtualBanheiro implements CenaAtual{

    BANHEIRO,
    BANHEIRA,
    ESPELHO,
    PIA,
    ARMARIO_PIA_BANHEIRO,
    ARMARIO_ESPELHO_BANHEIRO;


    public Cena cenaAnterior(Personagem personagem) {
        if (personagem.getCenaAtual().equals(CenaAtualBanheiro.BANHEIRO)) {
            return new Quarto(personagem);
        } else if (personagem.getCenaAtual().equals(CenaAtualBanheiro.BANHEIRA)
                || personagem.getCenaAtual().equals(CenaAtualBanheiro.ESPELHO)
                || personagem.getCenaAtual().equals(CenaAtualBanheiro.PIA)) {
            return new Banheiro(personagem);
        } else if (personagem.getCenaAtual().equals(CenaAtualBanheiro.ARMARIO_PIA_BANHEIRO)) {
            return new PiaBanheiro(personagem);
        } else if (personagem.getCenaAtual().equals(CenaAtualBanheiro.ARMARIO_ESPELHO_BANHEIRO)) {
            return new EspelhoBanheiro(personagem);
        }
        return null;
    }
}
