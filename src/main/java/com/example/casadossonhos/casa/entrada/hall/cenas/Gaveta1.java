package com.example.casadossonhos.casa.entrada.hall.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualHall;

public class Gaveta1 extends Cena {
    public Gaveta1(Personagem personagem) {
        super(personagem);


    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualHall.GAVETA1);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Textos/2-1-Abrir gaveta 1.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Não possui");
    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new ArmarioHall(getPersonagem()));
    }
}
