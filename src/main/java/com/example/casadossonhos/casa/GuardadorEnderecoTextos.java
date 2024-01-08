package com.example.casadossonhos.casa;

public class GuardadorEnderecoTextos {

    private String enderecoBase;
    private String enderecoTexto;
    private String enderecoAcoes;

    public GuardadorEnderecoTextos() {
        this.enderecoBase = "src/main/resources/com/example/casadossonhos/Textos/Acasadossonhos/Entrada/";
    }

    private String getEnderecoBase() {
        return enderecoBase;
    }

    public String getEnderecoTexto() {
        return this.getEnderecoBase() + enderecoTexto;
    }

    public void setEnderecoTexto(java.lang.String enderecoTexto) {
        this.enderecoTexto = enderecoTexto;
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

