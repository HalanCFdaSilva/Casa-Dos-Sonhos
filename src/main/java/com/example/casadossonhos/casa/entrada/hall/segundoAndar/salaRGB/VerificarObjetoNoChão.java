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

        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Opcoes/5-3- Verificar a porta com leds.txt");


    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualRGB.OBJETO_NO_CHAO);
    }
}
