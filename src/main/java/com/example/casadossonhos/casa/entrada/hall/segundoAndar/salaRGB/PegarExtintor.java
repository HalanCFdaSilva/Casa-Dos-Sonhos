package com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaRGB;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualRGB;

public class PegarExtintor extends Cena {
    public PegarExtintor(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().getInventario().pegarItem("extintor");
    }


    @Override
    public void guardarEnderecoTexto() {

        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Rgb/Textos/2- Pegar o extintor.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes();

    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualRGB.PEGAR_EXTINTOR);
    }
}
