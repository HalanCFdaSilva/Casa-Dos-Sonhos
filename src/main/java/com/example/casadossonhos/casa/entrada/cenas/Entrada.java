package com.example.casadossonhos.casa.entrada.cenas;


import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEntrada;
import javafx.stage.Stage;


public class Entrada extends Cena {




    public Entrada(Personagem personagem) {
        super(personagem);

    }




    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Textos/Entrada.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Opcoes/Entrada.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.funcaoBotao( new SeAproximarDaCasa(this.getPersonagem()),"Se aproximar da casa");
        botoes.funcaoBotao( new IrEmbora(this.getPersonagem()), "Ir Embora");
        botoes.desativarVoltar(this.pane);
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualEntrada.ENTRADA);
    }


}
