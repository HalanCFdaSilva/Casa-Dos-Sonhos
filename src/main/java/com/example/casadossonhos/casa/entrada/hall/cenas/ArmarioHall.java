package com.example.casadossonhos.casa.entrada.hall.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualHall;

public class ArmarioHall extends Cena {
    public ArmarioHall(Personagem personagem) {
        super(personagem);



    }

    @Override
    public void start() throws Exception {
        this.getPersonagem().setCenaAtual(CenaAtualHall.ARMARIO_HALL);
        super.start();

    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Textos/2- Verificar armário destoante.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Opcoes/2- Verificar armário destoante.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.funcaoBotao(new Gaveta1(this.getPersonagem()), "Abrir gaveta 1");
        botoes.funcaoBotao(new Gaveta2(this.getPersonagem()), "Abrir gaveta 2");
        botoes.funcaoBotao(new Gaveta3(this.getPersonagem()), "Abrir gaveta 3");
    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new Hall(getPersonagem()));
    }
}
