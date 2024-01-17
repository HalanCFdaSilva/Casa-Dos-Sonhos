package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada;

import com.example.casadossonhos.Comandos.alerta.AlertaMorte;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEmpalhada;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;

public class Urso extends Cena {
    public Urso(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void start() throws Exception {

        super.start();
        this.getPersonagem().getAgregadorModificadores().getAgregadorEventos().find("Morte urso").ativar();
        AlertaMorte.alertaVidaInfinita(new Hall(this.getPersonagem()));
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Textos/3- Observar urso.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.desativarVoltar(this.pane);
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualEmpalhada.URSO);
    }
}
