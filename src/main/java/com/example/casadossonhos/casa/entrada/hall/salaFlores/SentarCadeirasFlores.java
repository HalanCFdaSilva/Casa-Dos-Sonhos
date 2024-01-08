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
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualFlores.SENTAR_CADEIRA_FLORES);


    }

    @Override
    public void guardarEnderecoTexto() {
        if (this.getPersonagem().getInventario().isPegouItem("Prontuario medico")){
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Flores/Opcoes/2- Sentar em uma das cadeiras(pegou envelope).txt");
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Flores/Textos/2- Sentar em uma das cadeiras(pegou envelope).txt");
        }else{
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Flores/Opcoes/2- Sentar em uma das cadeiras( nao pegou envelope).txt");
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Flores/Textos/2- Sentar em uma das cadeiras( nao pegou envelope).txt");
        }

    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new OlharMesaSalaFlores(this.getPersonagem()));
    }
}
