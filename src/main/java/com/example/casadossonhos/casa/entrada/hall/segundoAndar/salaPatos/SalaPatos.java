package com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaPatos;

import com.example.casadossonhos.Comandos.alerta.AlertaSenhaPatos;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualPatos;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.SegundoAndar;

public class SalaPatos extends Cena {

    public SalaPatos(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {

        if (this.getPersonagem().getInteracoes().getInteracao("SalaPatosSenha").isPrimeiraVez()){
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Textos/5-1- Verificar porta com desenho de pato.txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Opcoes/5-1- Verificar porta com desenho de pato.txt");
        }else {
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Patos/Textos/Sala Patos.txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Sala Patos/Opcoes/Sala Patos.txt");
        }

    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if(!this.getPersonagem().getInteracoes().getInteracao("SalaPatosSenha").isPrimeiraVez()){
            botoes.funcaoBotao(new VerificarLadoEsquerdo(this.getPersonagem()),
                    "Verificar lado esquerdo");
            botoes.funcaoBotao(new VerificarMeio(this.getPersonagem()), "Verificar o meio");
            botoes.funcaoBotao(new VerificarLadoDireito(this.getPersonagem()),
                    "Verificar o lado direito");
        } else {
            botoes.criaAlerta(new AlertaSenhaPatos(new SalaPatos(this.getPersonagem())),"Digitar senha");


        }
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualPatos.SALA_PATOS);
    }

}
