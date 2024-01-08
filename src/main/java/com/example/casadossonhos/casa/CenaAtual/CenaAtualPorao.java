package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.SalaEmpalhada;
import com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao.Porao;

public enum CenaAtualPorao implements CenaAtual {

    PORAO,
    SALA_MORTE,
    SALA_VIDA;

    @Override
    public Cena cenaAnterior(Personagem personagem) {
        switch ((CenaAtualPorao)personagem.getCenaAtual()){
            case PORAO: return new SalaEmpalhada(personagem);
            case SALA_VIDA: return  new Porao(personagem);
            default: return null;
        }
    }

    @Override
    public String modificadorAmbienteTexto(Personagem personagem, String enderecoTexto) {
        switch ((CenaAtualPorao) personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }
}
