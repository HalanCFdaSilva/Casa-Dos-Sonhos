package com.example.casadossonhos.casa.CenaAtual;


import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.SegundoAndar;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto.Quarto;

public enum CenaAtualQuarto implements CenaAtual {
    ARMARIO_QUARTO,
    QUARTO,
    QUEBRAR_GLOBO_DE_NEVE,
    SACUDIR_GLOBO_DE_NEVE;

    @Override
    public Cena cenaAnterior(Personagem personagem) {
        switch ((CenaAtualQuarto)personagem.getCenaAtual()){
            case ARMARIO_QUARTO: return new Quarto(personagem);
            case QUARTO: return new SegundoAndar(personagem);
            default : return null;
        }
    }


}
