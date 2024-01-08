package com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaRGB;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualRGB;

public class VerificarRadio extends Cena {
    public VerificarRadio(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void start() throws Exception {

        super.start();

    }

    @Override
    public void guardarEnderecoTexto() {

    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualRGB.RADIO);
    }
}
