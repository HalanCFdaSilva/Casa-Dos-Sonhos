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
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Flores/Textos/sala flores.txt");

        if (!this.getPersonagem().getAgregadorModificadores().getAgregadorInteracaoInicial().isPrimeiraVez("SalaPatos")){
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");
        }else{
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Flores/Opcoes/sala flores.txt");
        }
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if (!this.getPersonagem().getAgregadorModificadores().getAgregadorInteracaoInicial().isPrimeiraVez("SalaPatos")){

        }else {
            botoes.funcaoBotao(new VerificarArvore(this.getPersonagem()),
                    "Verificar Arvore");

            botoes.funcaoBotao(new OlharMesaSalaFlores(this.getPersonagem()),
                    "olhar.txt a mesa");

            botoes.funcaoBotao(new VerificarTotem(this.getPersonagem()),
                    "Verificar o Totêm");
        }
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualFlores.SALA_FLORES);
    }

}
