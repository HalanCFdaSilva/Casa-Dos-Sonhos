package com.example.casadossonhos.Comandos.textos;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Textos {

    private Label textoOqueVoceDesejaFazer;

    private TextArea históriaJogo;

    public void CriarLabel(){
        this.textoOqueVoceDesejaFazer = new Label("Oque você deseja fazer?");
        this.textoOqueVoceDesejaFazer.setLayoutX(337);
        this.textoOqueVoceDesejaFazer.setLayoutY(40);
        this.textoOqueVoceDesejaFazer.setFont(Font.font("Lucida Console",14));
        this.textoOqueVoceDesejaFazer.setId("texto-Opcoes");
    }

    public void criarTextArea(){
        this.históriaJogo = new TextArea();
        this.históriaJogo.setEditable(false);
        this.históriaJogo.setWrapText(true);
        this.históriaJogo.setFont(Font.font("Lucida Console",14));
        this.históriaJogo.setPrefHeight(460);
        this.históriaJogo.setPrefWidth(298);
        this.históriaJogo.setLayoutX(28);
        this.históriaJogo.setLayoutY(52);
    }
    public void incluirTexto(String enderecoTexto) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(enderecoTexto));
        this.históriaJogo.setText(scanner.nextLine());
        while(scanner.hasNext()) {
            this.históriaJogo.appendText("\n");
            this.históriaJogo.appendText(scanner.nextLine());


        }
        scanner.close();
    }

    public Pane adicionarNodes(Pane pane){
        pane.getChildren().addAll(this.históriaJogo, this.textoOqueVoceDesejaFazer);
        return pane;

    }
}
