package com.example.casadossonhos.casa.entrada.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEntrada;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;

public class BaterAPorta extends Cena {
    public BaterAPorta(Personagem personagem) {
        super(personagem);

    }



    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Opcoes/1-2- Bater na porta.txt");
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Textos/1-2- Bater na porta.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.funcaoBotao(new EsperarUmPouco(this.getPersonagem()),"Esperar um pouco");
        botoes.funcaoBotao(new Hall(this.getPersonagem()),"Entrar na casa");
        botoes.funcaoBotao(new IrEmbora(this.getPersonagem()),"Ir finalmente embora");
        botoes.desativarVoltar(this.pane);


    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualEntrada.BATER_A_PORTA);
    }


}
