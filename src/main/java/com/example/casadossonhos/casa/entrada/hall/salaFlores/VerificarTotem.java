package com.example.casadossonhos.casa.entrada.hall.salaFlores;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualFlores;

public class VerificarTotem extends Cena {
    public VerificarTotem(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualFlores.VERIFICAR_TOTEM);
    }

    @Override
    public void guardarEnderecoTexto() {


    }
}
