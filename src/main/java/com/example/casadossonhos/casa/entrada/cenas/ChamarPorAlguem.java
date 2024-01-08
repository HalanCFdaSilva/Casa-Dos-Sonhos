package com.example.casadossonhos.casa.entrada.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEntrada;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;

public class ChamarPorAlguem extends Cena {
    public ChamarPorAlguem(Personagem personagem) {
        super(personagem);
    }



    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Textos/1-2-1-2- Chamar alguêm.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Opcoes/1-2-1-2- Chamar alguêm.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.funcaoBotao(new Hall(this.getPersonagem()),"Entrar na casa");
        botoes.funcaoBotao(new EsperarMaisUmPouco(this.getPersonagem()),
                "Esperar novamente");
        botoes.funcaoBotao(new IrEmbora(this.getPersonagem()),"Ir embora");
        botoes.desativarVoltar(this.pane);
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualEntrada.CHAMAR_POR_ALGUEM);
    }


}
