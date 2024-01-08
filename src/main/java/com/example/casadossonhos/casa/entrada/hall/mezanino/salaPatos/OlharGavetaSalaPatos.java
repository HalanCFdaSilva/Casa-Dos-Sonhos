package com.example.casadossonhos.casa.entrada.hall.mezanino.salaPatos;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualPatos;

public class OlharGavetaSalaPatos extends Cena {
    public OlharGavetaSalaPatos(Personagem personagem) {
        super(personagem);

    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualPatos.OLHAR_GAVETA);

    }

    @Override
    public void guardarEnderecoTexto() {
        if (!this.getPersonagem().getInventario().isPegouItem("chave Flores")){
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Patos/Textos/3-2-Olhar gaveta.txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Sala Patos/Opcoes/3-2-Olhar gaveta.txt");
        }else{
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Patos/Textos/3-2-Olhar gaveta(sem chave).txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Não possui");
        }
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if (!this.getPersonagem().getInventario().isPegouItem("chave Flores")){
            botoes.pegarItem("Pegar a chave","chave Flores").
                    funcaoBotao(new VerificarLadoDireito(this.getPersonagem()),
                            "Pegar a chave");

        }
    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new VerificarLadoDireito(this.getPersonagem()));
    }
}
