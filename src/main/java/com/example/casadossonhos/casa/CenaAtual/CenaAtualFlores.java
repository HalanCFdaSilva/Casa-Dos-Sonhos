package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;
import com.example.casadossonhos.casa.entrada.hall.salaFlores.OlharMesaSalaFlores;
import com.example.casadossonhos.casa.entrada.hall.salaFlores.SalaFlores;

public enum CenaAtualFlores implements CenaAtual {

    SALA_FLORES,
    VERIFICAR_ARVORE,
    OLHAR_MESA_FLORES,
    SENTAR_CADEIRA_FLORES,
    VERIFICAR_TOTEM;

    @Override
    public Cena cenaAnterior(Personagem personagem) {
        switch ((CenaAtualFlores)personagem.getCenaAtual()){
            case SALA_FLORES: return new Hall(personagem);
            case VERIFICAR_ARVORE,OLHAR_MESA_FLORES,VERIFICAR_TOTEM: return new SalaFlores(personagem);
            case SENTAR_CADEIRA_FLORES: return new OlharMesaSalaFlores(personagem);
            default: return null;
        }
    }



}
