package com.example.casadossonhos.casa.entrada.hall.mezanino.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;
import com.example.casadossonhos.casa.entrada.hall.mezanino.quarto.Quarto;


public class Banheiro extends Cena {
    public Banheiro(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.BANHEIRO);
    }

    @Override
    public void guardarEnderecoTexto() {

    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new Quarto(this.getPersonagem()));
    }
}
