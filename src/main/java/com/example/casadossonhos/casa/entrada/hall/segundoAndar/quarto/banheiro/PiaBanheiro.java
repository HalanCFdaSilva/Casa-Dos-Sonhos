package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;

public class PiaBanheiro extends Cena {
    public PiaBanheiro(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {

    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.PIA);
    }
}
