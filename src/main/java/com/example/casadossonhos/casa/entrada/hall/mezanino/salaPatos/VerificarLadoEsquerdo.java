package com.example.casadossonhos.casa.entrada.hall.mezanino.salaPatos;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualPatos;

public class VerificarLadoEsquerdo extends Cena {
    public VerificarLadoEsquerdo(Personagem personagem) {
        super(personagem);

    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualPatos.LADO_ESQUERDO);


    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoAcoes();
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Patos/Textos/2- Verificar lado esquerdo.txt");
    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new SalaPatos(this.getPersonagem()));
    }
}
