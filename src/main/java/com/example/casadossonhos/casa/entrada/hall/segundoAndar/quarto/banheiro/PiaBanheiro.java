package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Comandos.alerta.SeLavarAlert;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;

public class PiaBanheiro extends Cena {
    public PiaBanheiro(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Quarto/banheiro/Textos/3- Verificar pia.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Quarto/banheiro/Opcoes/3- Verificar pia.txt");

    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.criaAlerta(new SeLavarAlert(),"Se lavar");

        botoes.funcaoBotao(new GavetaPiaBanheiro(this.getPersonagem()),"Verificar Gaveta");
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.PIA);
    }
}
