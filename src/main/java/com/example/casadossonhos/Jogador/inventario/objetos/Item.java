package com.example.casadossonhos.Jogador.inventario.objetos;

public class Item {

    private String nomeItem;
    private boolean pegouItem;

    private String enderecoDescricaoItem;

    public Item(String nomeItem){
        this.pegouItem = false;
        this.nomeItem = nomeItem;
    }

    public String getEnderecoDescricaoItem() {
        return enderecoDescricaoItem;
    }

    public void setEnderecoDescricaoItem(String enderecoDescricaoItem) {
        this.enderecoDescricaoItem = enderecoDescricaoItem;
    }

    public void pegouItem(){
        this.pegouItem = true;
    }
    public boolean isPegouItem() {
        return pegouItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }


}
