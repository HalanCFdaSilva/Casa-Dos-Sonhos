package com.example.casadossonhos.casa.entrada.hall.salaFlores;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualFlores;

public class VerificarTotem extends Cena {
    public VerificarTotem(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {


    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualFlores.VERIFICAR_TOTEM);
    }
}
