package com.example.casadossonhos.Jogador.inventario;

import com.example.casadossonhos.Jogador.inventario.objetos.Item;
import com.example.casadossonhos.Jogador.inventario.objetos.tiposObjetos.Artefato;
import com.example.casadossonhos.Jogador.inventario.objetos.tiposObjetos.Chave;
import com.example.casadossonhos.Jogador.inventario.objetos.tiposObjetos.Documento;
import com.example.casadossonhos.Jogador.inventario.objetos.tiposObjetos.OutroItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;


public class Inventario {

    private ArrayList<Documento> documentos;

    private ArrayList<Chave> chaves;

    private ArrayList<OutroItem> outros;

    private Artefato estatua;
    private MenuBar menuBar;


    public Inventario(){
        this.documentos = new ArrayList<>();

        Documento diario = new Documento("Diário");
        documentos.add(diario);

        Documento obituario = new Documento("Obituario");
        documentos.add(obituario);

        Documento certidaoNascimento = new Documento("Certidão Nascimento");
        documentos.add(certidaoNascimento);

        Documento panfletoMuseu = new Documento("panfleto Museu");
        documentos.add(panfletoMuseu);

        Documento identidade = new Documento("identidade");
        documentos.add(identidade);

        Documento jornal = new Documento("jornal");
        documentos.add(jornal);

        Documento testamento = new Documento("testamento");
        documentos.add(testamento);

        Documento prontuarioMedico = new Documento("Prontuario médico");
        documentos.add(prontuarioMedico);


        this.chaves = new ArrayList<>();

        Chave chaveEnferrujada =new Chave("chave Enferrujada");
        chaves.add(chaveEnferrujada);

        Chave chaveFlores =new Chave("chave Flores");
        chaves.add(chaveFlores);

        Chave chaveFerro =new Chave("chave Ferro");
        chaves.add(chaveFerro);


        this.outros = new ArrayList<>();

        OutroItem bolaDeCristal = new OutroItem("Globo de neve");
        this.outros.add(bolaDeCristal);

        OutroItem fitaCassete = new OutroItem("Fita Cassete");
        this.outros.add(fitaCassete);

        OutroItem gazua = new OutroItem("Gazua");
        this.outros.add(gazua);

        OutroItem extintor = new OutroItem("extintor");
        this.outros.add(extintor);


        this.estatua = new Artefato("estatua");
    }


    public void criarMenuInventario(){

        this.menuBar = new MenuBar();
        menuBar.prefHeight(105);
        menuBar.prefWidth(25);
        menuBar.setLayoutX(339);
        menuBar.setLayoutY(70);


        Menu menu = new Menu("Inventário");

        Menu documentos = new Menu("Documentos");
        this.documentos.forEach(item -> {
            if (item.isPegouItem()){
                Menu documentoItem = new Menu(item.nomeDoItem());
                MenuItem olharDocumento = new MenuItem("Olhar documento");
                MenuItem usarDocumento = new MenuItem("Usar documento");
                documentoItem.getItems().addAll(olharDocumento,usarDocumento);
                documentos.getItems().add(documentoItem);

            }
        });


        Menu chaves = new Menu("chaves");
        this.chaves.forEach(item -> {
            if (item.isPegouItem()){
                Menu documentoItem = new Menu(item.getNomeItem());
                MenuItem olharDocumento = new MenuItem("Olhar chave");
                MenuItem usarDocumento = new MenuItem("Usar chave");
                documentoItem.getItems().addAll(olharDocumento,usarDocumento);
                chaves.getItems().add(documentoItem);

            }
        });

        Menu outros = new Menu("outros");
        this.outros.forEach(outroItem -> {
            if (outroItem.isPegouItem()){
                Menu item = new Menu(outroItem.getNomeItem());
                MenuItem olharItem = new MenuItem("Olhar item");
                MenuItem usarItem = new MenuItem("Usar item");
                item.getItems().addAll(olharItem,usarItem);
                outros.getItems().add(item);
            }
        });

        if (estatua.isPegouItem()){
            Menu artefato = new Menu("Artefato");
             Menu estatua = new Menu("estatua");
             MenuItem olharItem = new MenuItem("OlharItem");
             estatua.getItems().add(olharItem);
             artefato.getItems().add(estatua);

            menu.getItems().addAll(documentos,chaves,outros, artefato);
            menuBar.getMenus().add(menu);
        }else {
            menu.getItems().addAll(documentos,chaves,outros);
            menuBar.getMenus().add(menu);
        }

    }

    public Pane ativarMenu(Pane pane){
        pane.getChildren().add(menuBar);
        return pane;
    }

    public boolean isPegouItem(String nomeItem) {

        Item item = null;

        for (Documento documento : documentos){
            if (documento.getNomeItem().equals(nomeItem)){
                return documento.isPegouItem();
            }
        }


        for (Chave chave: chaves){
            if (chave.getNomeItem().equals(nomeItem)){
                return chave.isPegouItem();
            }
        }


        for (OutroItem outro : outros){
            if (outro.getNomeItem().equals(nomeItem)){
                return outro.isPegouItem();
            }
        }

        if (estatua.getNomeItem().equals(nomeItem)){
            return estatua.isPegouItem();
        }
        return false;

    }
    public void pegarItem(String nomeItem) {


        documentos.forEach(documento -> {
            if (documento.getNomeItem().equals(nomeItem)){
                documento.pegouItem();

            }});

        chaves.forEach(chave -> {
            if (chave.getNomeItem().equals(nomeItem)){
                chave.pegouItem();

            }
        });

        outros.forEach(outros -> {
            if (outros.getNomeItem().equals(nomeItem)){
                outros.pegouItem();

            }
        });
        if (estatua.getNomeItem().equals(nomeItem)){
            estatua.pegouItem();

        }

    }

    ////////////////////////////////////////////////////////////////////////////////
    /////////////////////////APAGAR DEPOIS TUDO ABAIXO///////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////



}
