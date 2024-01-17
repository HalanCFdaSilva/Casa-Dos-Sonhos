package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.portaTrancada;

public class PortaTrancada {

    private String nomeSala;
    private boolean portaDestrancada;

    public PortaTrancada(String nomeSala) {
        this.nomeSala = nomeSala;
        this.portaDestrancada = false;
    }

    public void destrancarPorta(){
        this.portaDestrancada = true;
    }

    public boolean isPortaDestrancada() {
        return portaDestrancada;
    }

    public boolean confirmarPorta(String SalaProcurada){
        if (nomeSala.equals(SalaProcurada)){
            return true;
        }else {
            return false;
        }
    }

}
