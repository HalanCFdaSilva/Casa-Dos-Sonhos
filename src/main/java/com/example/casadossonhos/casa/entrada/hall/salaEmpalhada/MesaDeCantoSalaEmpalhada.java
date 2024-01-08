package com.example.casadossonhos.casa.entrada.hall.salaEmpalhada;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualEmpalhada;

public class MesaDeCantoSalaEmpalhada extends Cena {
    public MesaDeCantoSalaEmpalhada(Personagem personagem) {
        super(personagem);




    }

    @Override
    public void start() throws Exception {
        super.start();
        this.getPersonagem().setCenaAtual(CenaAtualEmpalhada.MESA_DE_CANTO);
    }

    @Override
    public void guardarEnderecoTexto() {
        this.getGuardadorEnderecoTextos().setEnderecoTexto("Hall/Sala Empalhada/Textos/2- Verificar a mesa de canto.txt");
        this.getGuardadorEnderecoTextos().setEnderecoAcoes("FALTA.txt");
    }

    @Override
    public void setCenaAnterior() {
        this.setCenaAnterior(new SalaEmpalhada(this.getPersonagem()));
    }
}
