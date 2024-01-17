package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualBanheiro;

public class Banheira extends Cena {
    public Banheira(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Quarto/banheiro/Textos/1- Verificar banheira( primeira interacao).txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Quarto/banheiro/opcoes/1- Verificar banheira( cheia).txt");
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualBanheiro.BANHEIRA);

    }
}
