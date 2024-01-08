package com.example.casadossonhos.Comandos.alerta;

import com.example.casadossonhos.casa.Cena;

public abstract class Alerta  implements AtivaCenaInterface{

    private Cena cena;

    public Alerta(Cena cena) {
        this.cena = cena;
    }

    public Alerta(){}


    public Cena getCena() {
        return cena;
    }
}
