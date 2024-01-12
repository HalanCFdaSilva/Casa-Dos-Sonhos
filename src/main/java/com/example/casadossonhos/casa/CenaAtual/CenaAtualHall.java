package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.cenas.ArmarioHall;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;

public enum CenaAtualHall implements CenaAtual {
    ARMARIO_HALL,
    GAVETA1,
    GAVETA2,
    GAVETA3,
    HALL,
    IR_EMBORA_HALL,
    MESA_HALL;

    @Override
    public Cena cenaAnterior(Personagem personagem) {
        switch ((CenaAtualHall)personagem.getCenaAtual()){

            case GAVETA1,GAVETA2,GAVETA3: return new ArmarioHall(personagem);
            case ARMARIO_HALL,MESA_HALL,IR_EMBORA_HALL: return new Hall(personagem);
            default: return null;

        }
    }

}
