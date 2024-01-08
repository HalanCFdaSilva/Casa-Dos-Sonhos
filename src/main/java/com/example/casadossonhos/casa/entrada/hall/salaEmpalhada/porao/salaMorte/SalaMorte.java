package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao.salaMorte;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;

public class SalaMorte extends Cena {
    public SalaMorte(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {

        this.getGuardadorEnderecoTextos().setEnderecoTexto("FALTA.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes();

    }
}
