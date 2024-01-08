package com.example.casadossonhos.Jogador.inventario.objetos.tiposObjetos;

import com.example.casadossonhos.Jogador.inventario.objetos.Item;

public class Documento extends Item {

    private boolean documentoAberto;


    private final String tipoDocumento;
    private String caminhoTextoDocumentoNaoAberto;

    private String caminhoTextoDocumentoAberto;

    public Documento( String nomeDocumento) {
        super(nomeDocumento);


        this.tipoDocumento = "documento";
    }

    @Override
    public void pegouItem() {
        super.pegouItem();
        this.documentoAberto = false;
    }

    @Override
    public void setEnderecoDescricaoItem(String enderecoDescricaoItem) {
        super.setEnderecoDescricaoItem(enderecoDescricaoItem);
        this.caminhoTextoDocumentoNaoAberto = this.getEnderecoDescricaoItem() + "/naoAberto.txt";
        this.caminhoTextoDocumentoAberto = this.getEnderecoDescricaoItem() + "/aberto.txt";
    }

    @Override
    public String getEnderecoDescricaoItem() {
        if (isDocumentoAberto()){
            return this.getCaminhoTextoDocumentoAberto();
        }else {
            return this.getCaminhoTextoDocumentoNaoAberto();
        }
    }


    public String nomeDoItem() {
        if (this.isDocumentoAberto()){
            return super.getNomeItem();
        }else {
            return this.tipoDocumento;
        }

    }


    public boolean isDocumentoAberto() {
        return documentoAberto;
    }


    public String getCaminhoTextoDocumentoNaoAberto() {
        return caminhoTextoDocumentoNaoAberto;
    }

    public String getCaminhoTextoDocumentoAberto() {
        return caminhoTextoDocumentoAberto;
    }
}
