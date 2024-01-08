package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.Quarto;


public class Banheiro extends Cena {
    public Banheiro(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {

    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.BANHEIRO);
    }

}
