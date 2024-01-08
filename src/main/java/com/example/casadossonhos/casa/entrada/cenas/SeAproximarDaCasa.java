package com.example.casadossonhos.casa.entrada.cenas;


import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEntrada;

public class SeAproximarDaCasa extends Cena {

    public SeAproximarDaCasa(Personagem personagem) {
        super(personagem);

    }



    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Textos/1- Se aproximar da casa.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Opcoes/1- Se aproximar da casa.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.funcaoBotao(new OlharJanela(this.getPersonagem()), "Olhar a janela");
        botoes.funcaoBotao(new BaterAPorta(this.getPersonagem()), "Bater a porta");
        botoes.funcaoBotao(new IrEmbora(this.getPersonagem()), "Ir embora");
        botoes.desativarVoltar(this.pane);
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualEntrada.SE_APROXIMAR_DA_CASA);
    }


}
