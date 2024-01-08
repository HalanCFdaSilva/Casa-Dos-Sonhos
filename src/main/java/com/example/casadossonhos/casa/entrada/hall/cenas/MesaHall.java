package com.example.casadossonhos.casa.entrada.hall.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualHall;

public class MesaHall extends Cena {
    public MesaHall(Personagem personagem) {
        super(personagem);

    }


    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("FALTA.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualHall.MESA_HALL);
    }


}
