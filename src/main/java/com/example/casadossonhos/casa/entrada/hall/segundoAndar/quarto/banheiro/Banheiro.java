package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.Quarto;


public class Banheiro extends Cena {
    public Banheiro(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Quarto/banheiro/Textos/banheiro.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Quarto/banheiro/Opcoes/banheiro.txt");
    }

    @Override
    public void aoClicarBotao(){
        super.aoClicarBotao();
        botoes.funcaoBotao(new Banheira(this.getPersonagem()), "Verificar banheira");
        botoes.funcaoBotao(new EspelhoBanheiro(this.getPersonagem()), "Olhar espelho");
        botoes.funcaoBotao(new PiaBanheiro(this.getPersonagem()), "Verificar pia");


    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.BANHEIRO);
    }

}
