package com.example.casadossonhos.casa.entrada.hall.salaFlores;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualFlores;

public class OlharMesaSalaFlores extends Cena {
    public OlharMesaSalaFlores(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void start() throws Exception {

        this.getPersonagem().setCenaAtual(CenaAtualFlores.OLHAR_MESA_FLORES);
        super.start();

    }


    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Flores/Textos/2- Olhar a mesa.txt");
        if (this.getPersonagem().getInventario().isPegouItem("Prontuario médico")){
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Flores/Opcoes/2- Olhar a mesa(pegou o envelope).txt");
        }else{
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/Sala Flores/Opcoes/2- Olhar a mesa.txt");
        }
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if (!this.getPersonagem().getInventario().isPegouItem("Prontuario médico")){
            botoes.pegarItem("Pegar o envelope","Prontuario médico").
                    funcaoBotao(new OlharMesaSalaFlores(this.getPersonagem()), "Pegar o envelope");
        }

        botoes.funcaoBotao(new SentarCadeirasFlores(this.getPersonagem()), "Sentar em uma das cadeiras");

    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new SalaFlores(this.getPersonagem()));
    }
}
