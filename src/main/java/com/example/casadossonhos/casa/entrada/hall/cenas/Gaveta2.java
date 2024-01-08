package com.example.casadossonhos.casa.entrada.hall.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualHall;

public class Gaveta2 extends Cena {
    public Gaveta2(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualHall.GAVETA2);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Textos/2-2-Abrir gaveta 2.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Não possui");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.pegarItem("Voltar","chave Enferrujada");
    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new ArmarioHall(getPersonagem()));
    }
}
