package com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaRGB;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualRGB;

public class VerificarObjetoNoChão extends Cena {
    public VerificarObjetoNoChão(Personagem personagem) {
        super(personagem);

    }

    @Override
    public void start() throws Exception {

        super.start();
    }

    @Override
    public void guardarEnderecoTexto() {

        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Rgb/Textos/1- Pegar o objeto no chão.txt");


    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualRGB.OBJETO_NO_CHAO);
    }
}
