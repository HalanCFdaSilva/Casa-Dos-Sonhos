package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao.salaVida;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualPorao;
import com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao.Porao;

public class SalaVida extends Cena {
    public SalaVida(Personagem personagem) {
        super(personagem);
    }



    @Override
    public void guardarEnderecoTexto() {
        if (this.getPersonagem().getInteracoes().getInteracao("SalaVida").isPrimeiraVez()){
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Porao/sala vida/" +
                    "Textos/sala vida( trancada).txt");

        }else {
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Porao/sala vida/" +
                    "Textos/sala vida( abertaPrimeiraVez).txt");

        }
        this.getGuardadorEnderecoTextos().setEnderecoAcoes();

    }

    @Override
    public void cenaAtual() {
        getPersonagem().setCenaAtual(CenaAtualPorao.SALA_VIDA);
    }

}