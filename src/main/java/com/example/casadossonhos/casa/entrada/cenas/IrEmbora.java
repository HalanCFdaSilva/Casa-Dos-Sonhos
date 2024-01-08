package com.example.casadossonhos.casa.entrada.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEntrada;


public class IrEmbora extends Cena {
    public IrEmbora(Personagem personagem) {

        super(personagem);

    }



    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Textos/2-IrEmbora.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes();
    }

    @Override
    public void aoClicarBotao() {
        botoes.fimDeJogo(this.getPersonagem().getPrimaryStage());
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualEntrada.IR_EMBORA);
    }


}
