package com.example.casadossonhos.casa;

import com.example.casadossonhos.Comandos.botao.Botoes;
import com.example.casadossonhos.Comandos.textos.Textos;
import com.example.casadossonhos.Jogador.Personagem;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public abstract class Cena implements CenaService {

    private Cena cenaAnterior;
    private  Scene sceneBase1;
    private Personagem personagem;
    private GuardadorEnderecoTextos enderecoTextos;
    protected Botoes botoes;
    protected Textos textos;
    protected  Pane pane;

    public Cena(Personagem personagem) {

        this.personagem = personagem;
        this.criarCena();


    }

    private void criarCena(){

        this.textos = new Textos();
        this.pane = new Pane();
        this.sceneBase1 = new Scene(pane, 542, 576);

    }

    public GuardadorEnderecoTextos getGuardadorEnderecoTextos() {
        return enderecoTextos;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public Cena getCenaAnterior() {
        return cenaAnterior;
    }

    public void setCenaAnterior(Cena cenaAnterior) {

        this.cenaAnterior = cenaAnterior;
    }







    public void start() throws Exception {

        this.cenaAtual();
        this.enderecoTextos = new GuardadorEnderecoTextos(personagem);
        this.guardarEnderecoTexto();
        sceneBase1.getStylesheets().add("cssArchives/casa/properties.css");
        textos.CriarLabel();
        textos.criarTextArea();
        textos.incluirTexto(this.getGuardadorEnderecoTextos().getEnderecoTexto());


        this.botoes = new Botoes(this.getGuardadorEnderecoTextos().getEnderecoAcoes());
        this.botoes.setPersonagem(this.getPersonagem());
        this.aoClicarBotao();
        pane = botoes.AtivarBotoes(pane);
        pane = textos.adicionarNodes(pane);





        personagem.getInventario().criarMenuInventario();
        pane = personagem.getInventario().ativarMenu(pane);


        this.getPersonagem().getPrimaryStage().setTitle("A casa dos Sonhos");
        this.getPersonagem().getPrimaryStage().setScene(sceneBase1);
        this.getPersonagem().getPrimaryStage().show();


    }

    @Override
    public void aoClicarBotao() {
        this.setCenaAnterior(this.getPersonagem().getCenaAtual().cenaAnterior(getPersonagem()));
        botoes.funcaoBotao( this.cenaAnterior,"Voltar");

    }
}


