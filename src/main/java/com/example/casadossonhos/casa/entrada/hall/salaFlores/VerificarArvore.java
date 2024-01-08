package com.example.casadossonhos.casa.entrada.hall.salaFlores;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualFlores;

public class VerificarArvore extends Cena {
    public VerificarArvore(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualFlores.VERIFICAR_ARVORE);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Flores/Textos/1- Verificar Arvore.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Não possui");

    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new SalaFlores(this.getPersonagem()));
    }
}
