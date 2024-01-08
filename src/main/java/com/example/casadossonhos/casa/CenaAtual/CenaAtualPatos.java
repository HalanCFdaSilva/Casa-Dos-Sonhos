package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.SegundoAndar;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaPatos.SalaPatos;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaPatos.VerificarLadoDireito;

public enum CenaAtualPatos implements CenaAtual {
    OLHAR_GAVETA,
    SALA_PATOS,
    LADO_DIREITO,
    LADO_ESQUERDO,
    MEIO;

    @Override
    public Cena cenaAnterior(Personagem personagem) {
        switch ((CenaAtualPatos)personagem.getCenaAtual()){
            case MEIO,LADO_DIREITO,LADO_ESQUERDO: return new SalaPatos(personagem);
            case SALA_PATOS: return new SegundoAndar(personagem);
            case OLHAR_GAVETA: return new VerificarLadoDireito(personagem);
            default: return null;
        }
    }

    @Override
    public String modificadorAmbienteTexto(Personagem personagem, String enderecoTexto) {
        switch ((CenaAtualPatos) personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }
}
