package com.example.casadossonhos.casa.entrada.hall.mezanino.salaPatos;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualPatos;

public class VerificarMeio extends Cena {
    public VerificarMeio(Personagem personagem) {
        super(personagem);

    }

    @Override
    public void start() throws Exception {
        super.start();
       this.getPersonagem().setCenaAtual(CenaAtualPatos.MEIO);

    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Patos/Textos/1- Verificar berço.txt");
        if (!this.getPersonagem().getInventario().isPegouItem("Certidao Nascimento")){
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Sala Patos/Opcoes/1- Verificar berço.txt");
        }else{
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Não possui");
        }
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if (!this.getPersonagem().getInventario().isPegouItem("Certidao Nascimento")){
            botoes.pegarItem("Pegar envelope","Certidão Nascimento").
                    funcaoBotao(new VerificarMeio(this.getPersonagem()), "Pegar envelope");

        }
    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new SalaPatos(this.getPersonagem()));
    }
}
