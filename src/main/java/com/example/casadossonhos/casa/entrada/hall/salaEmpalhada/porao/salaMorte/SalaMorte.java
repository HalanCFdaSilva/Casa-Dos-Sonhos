package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao.salaMorte;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualPorao;

public class SalaMorte extends Cena {
    public SalaMorte(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void start() throws Exception {

        super.start();
    }

    @Override
    public void guardarEnderecoTexto() {

        this.getGuardadorEnderecoTextos().setEnderecoTexto("FALTA.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes();

    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();

    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualPorao.SALA_MORTE);
    }
}
