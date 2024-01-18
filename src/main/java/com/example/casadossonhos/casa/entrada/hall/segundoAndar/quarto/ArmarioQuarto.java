package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto;

import com.example.casadossonhos.Comandos.alerta.QuebrarGloboDeNeve;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualQuarto;

public class ArmarioQuarto extends Cena {
    public ArmarioQuarto(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {
        if (this.getPersonagem().getInventario().isPegouItem("Globo de neve")){
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");
            this.getGuardadorEnderecoTextos().setEnderecoTexto("FALTA.txt");
        }else {
            if (this.getPersonagem().getAgregadorModificadores().getAgregadorEventos().find("Sacudiu bola de cristal").isAtivo()){
                this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Quarto/Textos/1- Verificar armário.txt");
                this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Quarto/Opcoes/1-1- Sacudir o globo de neve.txt");
            }else {
                this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Quarto/Textos/1- Verificar armário.txt");
                this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Quarto/Opcoes/1- Verificar armário.txt");
            }
        }
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if (this.getPersonagem().getInventario().isPegouItem("Globo de neve")){

        }else {
            botoes.funcaoBotao(new SacudirGloboNeve(this.getPersonagem()),
                    "Sacudir o globo de neve");

            botoes.criaAlerta(new QuebrarGloboDeNeve(this.getPersonagem()),
                    "Quebrar o globo de neve");

            botoes.pegarItem("Globo de neve","guardar o globo de neve").
                    funcaoBotao(new ArmarioQuarto(this.getPersonagem()),
                            "guardar o globo de neve");

            botoes.funcaoBotao(new ArmarioQuarto(this.getPersonagem()),
                    "Deixar o globo de neve");
        }

    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualQuarto.ARMARIO_QUARTO);
    }

}
