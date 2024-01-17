package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;

public class EspelhoBanheiro extends Cena {
    public EspelhoBanheiro(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {

        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Quarto/banheiro/Textos/2- Verificar Espelho.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Quarto/banheiro/Opcoes/2- Verificar Espelho.txt");
    }

    @Override
    public void aoClicarBotao(){
        super.aoClicarBotao();
        botoes.funcaoBotao(new Banheira(this.getPersonagem()), "Verificar banheira");

        botoes.funcaoBotao(new EspelhoBanheiro(this.getPersonagem()), "Olhar espelho");



    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.ESPELHO);
    }
}
