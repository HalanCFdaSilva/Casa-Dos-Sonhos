package com.example.casadossonhos.casa.entrada.hall.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualHall;

public class IrEmboraHall extends Cena {
    public IrEmboraHall(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualHall.IR_EMBORA_HALL);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Não possui");
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Textos/6-Ir embora.txt");
    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new Hall(getPersonagem()));
    }
}
