package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;

public class Monologo extends Cena {
    public Monologo(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("FALTA.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");

    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.MONOLOGO);

    }
}
