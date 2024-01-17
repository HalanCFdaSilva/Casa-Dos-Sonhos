package com.example.casadossonhos.Comandos.alerta.Checador;

import com.example.casadossonhos.Comandos.alerta.Estacoes.*;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.entrada.hall.segundoAndar.salaRGB.VerificarRadio;


public class ChecadorRadio {

    Personagem personagem;

    public ChecadorRadio(Personagem personagem) {
        this.personagem = personagem;
    }

    public void checarNumeroRadio(String numeroRadio){

        if (numeroRadio.equals("192.0")){
            Estacao192 estacao192 = new Estacao192(this.personagem);
            try {
                estacao192.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        if (numeroRadio.equals("095.7")){
            Estacao957 estacao957 = new Estacao957(this.personagem);
            try {
                estacao957.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        if (numeroRadio.equals("506.0")){
            EstacaoCurahee estacaoCurahee = new EstacaoCurahee(this.personagem);
            try {
                estacaoCurahee.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        if (numeroRadio.equals("171.0")){
            EstacaoJabaa estacaoJabaa = new EstacaoJabaa(this.personagem);
            try {
                estacaoJabaa.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        if (numeroRadio.equals("388.3")){
            EstacaoLambda estacaoLambda = new EstacaoLambda(this.personagem);
            try {
                estacaoLambda.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }


        if (numeroRadio.equals("097.6")){
            EstacaoInsonia estacaoWake = new EstacaoInsonia(this.personagem);
            try {
                estacaoWake.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        if (numeroRadio.equals("590.6")){
            EstacaoSpode estacaoSpode = new EstacaoSpode(this.personagem);
            try {
                estacaoSpode.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        if (numeroRadio.equals("666.0")){

        }

        if(numeroRadio.equals("197.7")){
            EstacaoOANI estacaoOANI = new EstacaoOANI(this.personagem);
            try {
                estacaoOANI.show();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }



    }
}
