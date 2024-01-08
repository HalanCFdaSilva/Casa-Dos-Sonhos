package com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaPatos;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualPatos;

public class VerificarLadoEsquerdo extends Cena {
    public VerificarLadoEsquerdo(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoAcoes();
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Patos/Textos/2- Verificar lado esquerdo.txt");
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualPatos.LADO_ESQUERDO);
    }

}
