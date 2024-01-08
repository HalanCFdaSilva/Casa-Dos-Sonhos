package com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaPatos;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualPatos;

public class VerificarLadoDireito extends Cena {
    public VerificarLadoDireito(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Patos/Textos/3- Verificar lado direito.txt");
        if (!this.getPersonagem().getInventario().isPegouItem("Diario")){
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Sala Patos/Opcoes/3- Verificar lado direito.txt");
        }else{
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Sala Patos/Opcoes/3- Verificar lado direito(sem diario).txt");
        }
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if (!this.getPersonagem().getInventario().isPegouItem("Diário")){
            botoes.pegarItem("Pegar diario","Diário").
                    funcaoBotao(new VerificarLadoDireito(this.getPersonagem()), "Pegar diario");

        }
        botoes.funcaoBotao(new OlharGavetaSalaPatos(this.getPersonagem()),"Olhar gaveta");
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualPatos.LADO_DIREITO);
    }


}
