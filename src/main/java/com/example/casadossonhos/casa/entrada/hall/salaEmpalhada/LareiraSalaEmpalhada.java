package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEmpalhada;

public class LareiraSalaEmpalhada extends Cena {
    public LareiraSalaEmpalhada(Personagem personagem) {
        super(personagem);


    }


    @Override
    public void guardarEnderecoTexto() {
        if(this.getPersonagem().getAgregadorModificadores().getAgregadorEventos().find("Apagou lareira").isAtivo()){

        }else {
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Textos/1- olhar.txt lareira.txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes();
        }
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualEmpalhada.LAREIRA);
    }

}
