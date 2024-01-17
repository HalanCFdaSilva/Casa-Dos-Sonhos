package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;

public class ArmarioEspelhoBanheiro extends Cena {
    public ArmarioEspelhoBanheiro(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Quarto/banheiro/Textos/2-2- Abrir Espelho.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Quarto/banheiro/Opcoes/2-2- Abrir Espelho.txt");
    }

    @Override
    public void aoClicarBotao(){
        super.aoClicarBotao();
        botoes.pegarItem("Pegar a gazua", "gazua");



    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.ARMARIO_ESPELHO_BANHEIRO);

    }
}
