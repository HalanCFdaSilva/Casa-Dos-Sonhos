package com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaRGB;

import com.example.casadossonhos.Comandos.alerta.AlertaSintonizadorRadio;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualRGB;

public class VerificarRadio extends Cena {
    public VerificarRadio(Personagem personagem) {
        super(personagem);
    }


    @Override
    public void start() throws Exception {

        super.start();

    }

    @Override
    public void guardarEnderecoTexto() {

        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Sala Rgb/Textos/3- Verificar rádio.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Sala Rgb/Opcoes/3- Verificar rádio.txt");


    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.criaAlerta(new Estacao957(new VerificarRadio(this.getPersonagem())),"Apertar Botão 95.7");
        botoes.criaAlerta(new Estacao192(new VerificarRadio(this.getPersonagem())),
                "Apertar Botão 192.0");
        botoes.criaAlerta(new AlertaSintonizadorRadio(new VerificarRadio(this.getPersonagem())),
                "Apertar Botão Sintonizar");
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualRGB.RADIO);
    }
}
