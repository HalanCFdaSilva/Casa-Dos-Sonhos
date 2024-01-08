package com.example.casadossonhos.casa.entrada.hall.mezanino.quarto;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualQuarto;

public class QuebrarGloboDeNeve extends Cena {
    public QuebrarGloboDeNeve(Personagem personagem) {
        super(personagem);


    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualQuarto.QUEBRAR_GLOBO_DE_NEVE);
    }

    @Override
    public void guardarEnderecoTexto() {

    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new ArmarioQuarto(this.getPersonagem()));
    }
}
