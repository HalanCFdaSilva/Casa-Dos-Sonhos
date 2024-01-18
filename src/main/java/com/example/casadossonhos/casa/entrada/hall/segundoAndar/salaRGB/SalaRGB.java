package com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaRGB;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualRGB;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.SegundoAndar;

public class SalaRGB extends Cena {
    public SalaRGB(Personagem personagem) {
        super(personagem);

    }


    @Override
    public void guardarEnderecoTexto() {
        if (this.getPersonagem().getAgregadorModificadores().getAgregadorInteracaoInicial().isPrimeiraVez("SalaRGB")){
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Opcoes/5-3- Verificar a porta com leds.txt");
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Textos/5-3- Verificar a porta com leds.txt");
        }else {
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Rgb/Textos/salaRGB.txt");
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Sala Rgb/Opcoes/salaRGB.txt");
        }
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if(this.getPersonagem().getAgregadorModificadores().getAgregadorInteracaoInicial().isPrimeiraVez("SalaRGB")){

            botoes.entrou("SalaRGB","ENTRAR( Pensando porque eu estou aqui)").
                    funcaoBotao(new SalaRGB(this.getPersonagem()),
                            "ENTRAR( Pensando porque eu estou aqui)");

            botoes.funcaoBotao(new SegundoAndar(this.getPersonagem()),
                    "VOLTAR( Fechando a porta e desejando não ter de abri la de novo)");

            botoes.funcaoBotao(new SalaRGB(this.getPersonagem()),
                    "NÃO OUVI, PODE REPETIR");
            botoes.desativarVoltar(this.pane);
        } else {

            if (!this.getPersonagem().getInventario().isPegouItem("identidade")){
                botoes.funcaoBotao(new VerificarObjetoNoChão(this.getPersonagem()),"Pegar o objeto no chão");
            }


            if (!this.getPersonagem().getInventario().isPegouItem("extintor")){
                botoes.funcaoBotao(new PegarExtintor(this.getPersonagem()),"Pegar o extintor");
            }


            botoes.funcaoBotao(new VerificarRadio(this.getPersonagem()),"Verificar o rádio");


        }


    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualRGB.SALA_RGB);
    }
}
