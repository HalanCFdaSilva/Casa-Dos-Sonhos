package com.example.casadossonhos.casa.entrada.hall.salaFlores;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualFlores;
import com.example.casadossonhos.casa.entrada.cenas.OlharJanela;

public class SentarCadeirasFlores extends Cena {
    public SentarCadeirasFlores(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {

        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Flores/Textos/2- Sentar em uma das cadeiras.txt");
        if (this.getPersonagem().getInventario().isPegouItem("Prontuario medico")){
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Flores/Opcoes/2- Sentar em uma das cadeiras( pegou Prontuario médico).txt");
        }else{
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Flores/Opcoes/2- Sentar em uma das cadeiras.txt");

        }

    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualFlores.SENTAR_CADEIRA_FLORES);
    }
}
