package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.SalaEmpalhada;
import com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao.salaMorte.SalaMorte;
import com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.porao.salaVida.SalaVida;

public class Porao extends Cena {
    public Porao(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Porao/Textos/Porão.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Empalhada/Porao/Opcoes/Porão.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        this.botoes.funcaoBotao(new SalaVida(this.getPersonagem()),"Entrar na porta escrito VIDA");
        this.botoes.funcaoBotao(new SalaMorte(this.getPersonagem()),"Entrar na porta escrito MORTE");
        this.botoes.funcaoBotao(new SalaEmpalhada(this.getPersonagem()),"Dar meia volta e subir");
        botoes.desativarVoltar(this.pane);

    }
}
