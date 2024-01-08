package com.example.casadossonhos.casa.entrada.hall.salaFlores;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualFlores;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;

public class SalaFlores extends Cena {
    public SalaFlores(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {
        if (!this.getPersonagem().getInteracoes().getInteracao("SalaPatos").isPrimeiraVez()){

            this.getGuardadorEnderecoTextos().setEnderecoTexto("FALTA.txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");
        }else{
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Flores/Textos/sala flores.txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Flores/Opcoes/sala flores.txt");
        }
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if (!this.getPersonagem().getInteracoes().getInteracao("SalaPatos").isPrimeiraVez()){

        }else {
            botoes.funcaoBotao(new VerificarArvore(this.getPersonagem()),
                    "Verificar Arvore");

            botoes.funcaoBotao(new OlharMesaSalaFlores(this.getPersonagem()),
                    "Olhar a mesa");

            botoes.funcaoBotao(new VerificarTotem(this.getPersonagem()),
                    "Verificar o Totêm");
        }
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualFlores.SALA_FLORES);
    }

}
