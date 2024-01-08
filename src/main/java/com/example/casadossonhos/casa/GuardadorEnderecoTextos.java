package com.example.casadossonhos.casa;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.CenaAtual.CenaAtual;

public class GuardadorEnderecoTextos {

    private Personagem personagem;
    private String enderecoBase;
    private String enderecoTexto;
    private String enderecoAcoes;

    public GuardadorEnderecoTextos(Personagem personagem) {
        this.enderecoBase = "src/main/resources/com/example/casadossonhos/Textos/Acasadossonhos/Entrada/";
        this.personagem = personagem;
    }

    private String getEnderecoBase() {
        return enderecoBase;
    }

    public String getEnderecoTexto() {
        return this.getEnderecoBase() + enderecoTexto;
    }

    public void setEnderecoTexto(java.lang.String enderecoTexto) {
        this.enderecoTexto = this.personagem.getCenaAtual().modificadorAmbienteTexto(personagem,enderecoTexto);
    }

    public String getEnderecoAcoes() {
        if (this.enderecoAcoes.equals("Não possui")) {
            return this.enderecoAcoes;
        }
        return this.getEnderecoBase() + enderecoAcoes;
    }
    public void setEnderecoAcoes(String enderecoAcoes) {
        this.enderecoAcoes = enderecoAcoes;
    }

    public void setEnderecoAcoes() {
        this.enderecoAcoes = "Não possui";
    }
}

