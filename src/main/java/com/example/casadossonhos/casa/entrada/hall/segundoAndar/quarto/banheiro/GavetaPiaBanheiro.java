package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;

public class GavetaPiaBanheiro extends Cena {
    public GavetaPiaBanheiro(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {

        this.getGuardadorEnderecoTextos().setEnderecoTexto("FALTA.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");


    }

    @Override
    public void cenaAtual() {

        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.ARMARIO_PIA_BANHEIRO);
    }
}
