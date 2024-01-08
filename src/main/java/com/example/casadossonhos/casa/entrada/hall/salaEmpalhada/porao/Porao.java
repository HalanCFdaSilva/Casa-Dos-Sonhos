package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;

public class Porao extends Cena {
    public Porao(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Porao/Textos/Porão.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Empalhada/Porao/Opcoes/Porão.txt");
    }
}
