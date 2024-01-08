package com.example.casadossonhos.Comandos.alerta.Checador;

import com.example.casadossonhos.Comandos.alerta.AlertaSystemShock;
import com.example.casadossonhos.casa.Cena;

public class ChecadorSenhaPatos {
    private final String senhaDigitada;
    private final Cena salaPatos;

    public ChecadorSenhaPatos(String senhaDigitada, Cena salaPatos) {
        this.senhaDigitada = senhaDigitada;

        this.salaPatos = salaPatos;
    }

    public void checar() throws Exception {
        if(senhaDigitada.equals("1234")){
            this.salaPatos.getPersonagem().getInteracoes().getInteracao("SalaPatosSenha").primeiraInteracao();
            this.salaPatos.start();
        }
        if (senhaDigitada.equals("0451")){
            AlertaSystemShock alertaSystemShock = new AlertaSystemShock();
            alertaSystemShock.show();
        }

    }
}
