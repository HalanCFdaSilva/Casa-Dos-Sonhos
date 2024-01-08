package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualQuarto;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.SegundoAndar;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.banheiro.Banheiro;

public class Quarto extends Cena {
    public Quarto(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void guardarEnderecoTexto() {
        if (this.getPersonagem().getInteracoes().getInteracao("Quarto").isPrimeiraVez()) {
            this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Opcoes/5-2- Verificar porta simples.txt");
            this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Textos/5-2- Verificar porta simples.txt");
        } else {
            if (this.getPersonagem().getEventos().find("Quebrou bola de cristal").isAtivo()) {
                if (this.getPersonagem().getInventario().isPegouItem("Fita Cassete")) {
                    this.getGuardadorEnderecoTextos().setEnderecoTexto("FALTA.txt");
                    this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");
                } else {
                    this.getGuardadorEnderecoTextos().setEnderecoTexto("FALTA.txt");
                    this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");
                }

            } else {
                this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Quarto/Textos/Quarto.txt");
                this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Quarto/Opcoes/Quarto.txt");
            }

        }
    }
    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        if (this.getPersonagem().getInteracoes().getInteracao("Quarto").isPrimeiraVez()) {
            botoes.entrou("SalaRGB", "Entrar").
                    funcaoBotao(new Quarto(this.getPersonagem()),
                            "Entrar");
        } else {
            botoes.funcaoBotao(new ArmarioQuarto(this.getPersonagem()),
                    "Verificar armário");
            botoes.funcaoBotao(new Banheiro(this.getPersonagem()),
                    "Entrar no banheiro");
        }
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualQuarto.QUARTO);
    }

}



