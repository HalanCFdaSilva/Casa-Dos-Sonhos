package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEmpalhada;

public class LareiraSalaEmpalhada extends Cena {
    public LareiraSalaEmpalhada(Personagem personagem) {
        super(personagem);


    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualEmpalhada.LAREIRA);
    }

    @Override
    public void guardarEnderecoTexto() {
        if(this.getPersonagem().getEventos().find("Apagou lareira").isAtivo()){

        }else {
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Textos/1- Olhar lareira( sem item).txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes();
        }
    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new SalaEmpalhada(getPersonagem()));
    }
}
