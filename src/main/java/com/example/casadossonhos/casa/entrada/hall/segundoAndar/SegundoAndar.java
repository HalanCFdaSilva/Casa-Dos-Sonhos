package com.example.casadossonhos.casa.entrada.hall.segundoAndar;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualSegundoAndar;
import com.example.casadossonhos.casa.entrada.hall.cenas.Hall;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.Quarto;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaPatos.SalaPatos;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaRGB.SalaRGB;

public class SegundoAndar extends Cena {
    public SegundoAndar(Personagem personagem) {
        super(personagem);

    }

    @Override
    public void start() throws Exception {

        super.start();

    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("Hall/segundo andar/Opcoes/5- Subir escadas.txt");
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/segundo andar/Textos/5- Subir escadas.txt");
        this.getPersonagem().setCenaAtual(CenaAtualSegundoAndar.SEGUNDO_ANDAR);
    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.funcaoBotao(new SalaPatos(this.getPersonagem()), "Verificar porta com desenho de pato");
        botoes.funcaoBotao(new Quarto(this.getPersonagem()), "Verificar porta simples");
        botoes.funcaoBotao(new SalaRGB(this.getPersonagem()), "Verificar a porta com leds");
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualSegundoAndar.SEGUNDO_ANDAR);
    }


}
