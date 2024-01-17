package com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaPatos;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualPatos;

public class OlharGavetaSalaPatos extends Cena {
    public OlharGavetaSalaPatos(Personagem personagem) {
        super(personagem);

    }


    @Override
    public void guardarEnderecoTexto() {
        if (!this.getPersonagem().getInventario().isPegouItem("chave Flores")){
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Patos/Textos/3-2-olhar.txt gaveta.txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Sala Patos/Opcoes/3-2-olhar.txt gaveta.txt");
        }else{
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Patos/Textos/3-2-olhar.txt gaveta(sem chave).txt");
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
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualPatos.OLHAR_GAVETA);
    }
}
