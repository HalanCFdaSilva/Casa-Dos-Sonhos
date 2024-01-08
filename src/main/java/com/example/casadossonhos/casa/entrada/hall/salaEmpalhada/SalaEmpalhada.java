package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEmpalhada;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;
import com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao.Porao;

public class SalaEmpalhada extends Cena {
    public SalaEmpalhada(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualEmpalhada.SALA_EMPALHADA);

    }

    @Override
    public void guardarEnderecoTexto() {
        if (this.getPersonagem().getEventos().find("Morte urso").isAtivo()){
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Textos/" +
                    "sala empalhada( Variante primeira vez pós urso).txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Empalhada/Opcoes/" +
                    "sala empalhada( Variante primeira vez pós urso).txt");

        }else{
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Textos/" +
                    "sala Empalhada ( variante primeira vez).txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Empalhada/Opcoes/" +
                    "sala Empalhada ( variante primeira vez).txt");
        }

    }

    @Override
    public void aoClicarBotao() {

        super.aoClicarBotao();
        botoes.funcaoBotao(new LareiraSalaEmpalhada(this.getPersonagem()),"Olhar lareira");
        botoes.funcaoBotao(new MesaDeCantoSalaEmpalhada(this.getPersonagem()),"Verificar mesa de canto");

        if (this.getPersonagem().getEventos().find("Morte urso").isAtivo()){
            botoes.funcaoBotao(new Porao(this.getPersonagem()), "Verificar porta enferrujada");
        }else{
            botoes.funcaoBotao(new Urso(this.getPersonagem()), "Observar o urso");
        }

    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new Hall(this.getPersonagem()));
    }
}
