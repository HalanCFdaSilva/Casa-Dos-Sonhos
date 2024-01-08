package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;
import com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.SalaEmpalhada;

public enum CenaAtualEmpalhada implements CenaAtual {

    URSO,
    SALA_EMPALHADA,
    LAREIRA,
    MESA_DE_CANTO;


    @Override
    public Cena cenaAnterior(Personagem personagem) {
        switch ((CenaAtualEmpalhada) personagem.getCenaAtual()){
            case SALA_EMPALHADA : return new Hall(personagem);
            case LAREIRA, MESA_DE_CANTO,URSO: return new SalaEmpalhada(personagem);
            default: return null;

        }
    }

    @Override
    public String modificadorAmbienteTexto(Personagem personagem, String enderecoTexto) {
        switch ((CenaAtualEmpalhada) personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }
}
