package com.example.casadossonhos.casa.entrada.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEntrada;

public class OlharJanela extends Cena {
    public OlharJanela(Personagem personagem) {
        super(personagem);

    }

    @Override
    public void start() throws Exception {
        super.start();
        getPersonagem().getAgregadorModificadores().getAgregadorEventos().find("olhar janela").ativar();
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Opcoes/1-1- Olhar janela.txt");
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Textos/1-1- Olhar janela.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        this.botoes.funcaoBotao(new BaterAPorta(this.getPersonagem()), "Bater na porta");
        this.botoes.funcaoBotao(new IrEmbora(this.getPersonagem()),"Ir embora");
        botoes.desativarVoltar(this.pane);
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualEntrada.OLHAR_JANELA);
    }


}
