package com.example.casadossonhos.casa.entrada.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEntrada;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;

public class EsperarMaisUmPouco extends Cena {
    public EsperarMaisUmPouco(Personagem personagem) {
        super(personagem);


    }



    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Textos/1-2-1-2-2- Esperar novamente.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Opcoes/1-2-1-2-2- Esperar novamente.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.funcaoBotao(new Hall(this.getPersonagem()),"Entrar na casa");
        botoes.desativarVoltar(this.pane);
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualEntrada.ESPERAR_MAIS_UM_POUCO);
    }


}
