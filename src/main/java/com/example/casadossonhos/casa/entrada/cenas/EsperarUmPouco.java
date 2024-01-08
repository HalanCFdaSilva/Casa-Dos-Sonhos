package com.example.casadossonhos.casa.entrada.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEntrada;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;

public class EsperarUmPouco extends Cena {
    public EsperarUmPouco(Personagem personagem) {
        super(personagem);

        this.getPersonagem().setCenaAtual(CenaAtualEntrada.ESPERAR_UM_POUCO);

    }

    @Override
    public void start() throws Exception {
        super.start();

    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Textos/1-2-1- Esperar um pouco.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Opcoes/1-2-1- Esperar um pouco.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.funcaoBotao(new Hall(this.getPersonagem()),"Entrar na casa");
        botoes.funcaoBotao(new ChamarPorAlguem(this.getPersonagem()), "Chamar por alguêm");
        botoes.funcaoBotao(new IrEmbora(this.getPersonagem()),"Ir embora");
        botoes.desativarVoltar(this.pane);
    }

}
