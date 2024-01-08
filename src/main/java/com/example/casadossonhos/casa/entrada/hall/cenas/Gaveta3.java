package com.example.casadossonhos.casa.entrada.hall.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualHall;

public class Gaveta3 extends Cena {
    public Gaveta3(Personagem personagem) {
        super(personagem);

    }


    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Textos/2-3-Abrir gaveta 3.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Não possui");
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualHall.GAVETA3);
    }


}
