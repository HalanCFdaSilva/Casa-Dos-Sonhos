package com.example.casadossonhos.Jogador.modificadoresDeAmbiente.agregadores;

import com.example.casadossonhos.Jogador.modificadoresDeAmbiente.evento.Evento;

import java.util.ArrayList;

public class AgregadorEventos {
    private ArrayList<Evento> eventos;

    public AgregadorEventos() {
        this.eventos = new ArrayList<>();

        Evento olharJanela =new Evento("olhar janela");
        this.eventos.add(olharJanela);

        Evento vapor =new Evento("Vapor");
        this.eventos.add(vapor);

        Evento monologo =new Evento("Monologo");
        this.eventos.add(monologo);

        Evento seLavar =new Evento("Se lavar");
        this.eventos.add(seLavar);

        Evento audioEncontroParcial =new Evento("Audio encontro parcial");
        this.eventos.add(audioEncontroParcial);

        Evento audioEncontroCompleto =new Evento("Audio encontro completo");
        this.eventos.add(audioEncontroCompleto);

        Evento morteUrso =new Evento("Morte urso");
        this.eventos.add(morteUrso);

        Evento encheuBanheira =new Evento("Encheu banheira");
        this.eventos.add(encheuBanheira);

        Evento ouviuRadioMuseu =new Evento("Ouviu radio museu");
        this.eventos.add(ouviuRadioMuseu);

        Evento pegouIdentidade =new Evento("Pegou identidade");
        this.eventos.add(pegouIdentidade);

        Evento leuDiario =new Evento("Leu diario");
        this.eventos.add(leuDiario);

        Evento leuObituario =new Evento("Leu obituario");
        this.eventos.add(leuObituario);

        Evento sacudiuBolaDeCristal =new Evento("Sacudiu bola de cristal");
        this.eventos.add(sacudiuBolaDeCristal);

        Evento quebrouBolaDeCristal =new Evento("Quebrou bola de cristal");
        this.eventos.add(quebrouBolaDeCristal);

        Evento ouviuEstacao192 =new Evento("Ouviu estacao 192");
        this.eventos.add(ouviuEstacao192);

        Evento apagouLareira = new Evento("Apagou lareira");
        this.eventos.add(apagouLareira);

        Evento abriuMesaSalaEmpalhada = new Evento("Abriu mesa sala empalhada");
        this.eventos.add(abriuMesaSalaEmpalhada);
    }

    public Evento find(String nomeEvento){
        Evento eventoProcurado = null;
        for (Evento evento:this.eventos) {
            if (evento.getNomeEvento().equals(nomeEvento)){
                eventoProcurado = evento;
                break;
            }

        }
        return eventoProcurado;
    }
}
