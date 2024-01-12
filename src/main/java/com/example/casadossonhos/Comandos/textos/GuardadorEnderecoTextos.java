package com.example.casadossonhos.Comandos.textos;

import com.example.casadossonhos.Jogador.Personagem;

public class GuardadorEnderecoTextos {


    private ModificadorEnderecoTextos modificadorEnderecoTextos;
    private Personagem personagem;
    private String enderecoBase;
    private String enderecoTexto;
    private String enderecoAcoes;

    public GuardadorEnderecoTextos(Personagem personagem) {
        this.enderecoBase = "src/main/resources/com/example/casadossonhos/Textos/Acasadossonhos/Entrada/";
        this.personagem = personagem;

        modificadorEnderecoTextos = new ModificadorEnderecoTextos(personagem);
    }


    private String getEnderecoBase() {
        return enderecoBase;
    }

    public String getEnderecoTexto() {
        return this.getEnderecoBase() + enderecoTexto;
    }

    public void setEnderecoTexto(String enderecoTexto) {
        this.enderecoTexto = this.modificadorEnderecoTextos.modificarEnderecoTexto(enderecoTexto);
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

