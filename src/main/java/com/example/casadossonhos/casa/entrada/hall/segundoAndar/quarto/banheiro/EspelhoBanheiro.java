package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;

public class EspelhoBanheiro extends Cena {
    public EspelhoBanheiro(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {

    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.ESPELHO);
    }
}
