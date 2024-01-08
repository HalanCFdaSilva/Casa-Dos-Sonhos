package com.example.casadossonhos.casa.entrada.hall.cenas;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualHall;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.SegundoAndar;
import com.example.casadossonhos.casa.entrada.hall.salaEmpalhada.SalaEmpalhada;
import com.example.casadossonhos.casa.entrada.hall.salaFlores.SalaFlores;

public class Hall extends Cena {
    public Hall(Personagem personagem) {
        super(personagem);


    }



    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Textos/Hall de entrada.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Opcoes/Hall de entrada.txt");
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.funcaoBotao(new SalaEmpalhada(this.getPersonagem()), "Verificar porta com a cabeça empalhada");
        botoes.funcaoBotao(new ArmarioHall(this.getPersonagem()), "Verificar armário destoante");
        botoes.funcaoBotao(new MesaHall(this.getPersonagem()), "Verificar panfleto na mesa");
        botoes.funcaoBotao(new SalaFlores(this.getPersonagem()), "Verificar porta cheia de flores");
        botoes.funcaoBotao(new SegundoAndar(this.getPersonagem()), "Subir escadas");
        botoes.funcaoBotao(new IrEmboraHall(this.getPersonagem()), "Ir embora");
        botoes.desativarVoltar(this.pane);
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualHall.HALL);
    }


}
