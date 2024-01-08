package com.example.casadossonhos.casa.entrada.hall.mezanino.salaRGB;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualRGB;
import com.example.casadossonhos.casa.entrada.hall.mezanino.SegundoAndar;

public class SalaRGB extends Cena {
    public SalaRGB(Personagem personagem) {
        super(personagem);

    }

    @Override
    public void start() throws Exception {

        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualRGB.SALA_RGB);


    }

    @Override
    public void guardarEnderecoTexto() {
        if (this.getPersonagem().getInteracoes().getInteracao("SalaRGB").isPrimeiraVez()){
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
        System.out.println(getPersonagem());
        if(this.getPersonagem().getInteracoes().getInteracao("SalaRGB").isPrimeiraVez()){

            botoes.entrou("SalaRGB","ENTRAR( Pensando porque eu estou aqui)").
                    funcaoBotao(new SalaRGB(this.getPersonagem()),
                            "ENTRAR( Pensando porque eu estou aqui)");
            botoes.funcaoBotao(new SegundoAndar(this.getPersonagem()),
                    "VOLTAR( Fechando a porta e desejando não ter de abri la de novo)");

            botoes.funcaoBotao(new SalaRGB(this.getPersonagem()),
                    "NÃO OUVI, PODE REPETIR");
            botoes.desativarVoltar(this.pane);
        } else {


        }


    }
}
