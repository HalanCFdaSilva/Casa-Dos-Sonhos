package com.example.casadossonhos.casa.CenaAtual;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;


public interface CenaAtual {

    Cena cenaAnterior(Personagem personagem);

    String modificadorAmbienteTexto(Personagem personagem, String enderecoTexto);
}
