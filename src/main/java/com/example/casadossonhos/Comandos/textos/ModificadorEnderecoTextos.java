package com.example.casadossonhos.Comandos.textos;

import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.CenaAtual.*;

public class ModificadorEnderecoTextos {

    private Personagem personagem;

    public ModificadorEnderecoTextos(Personagem personagem) {
        this.personagem = personagem;
    }

    public String modificarEnderecoTexto(String enderecoTexto){

        switch (personagem.getCenaAtual().getClass().getSimpleName()){

            case "CenaAtualBanheiro": return this.modificadorEnderecoCenaAtualBanheiro(enderecoTexto);


            case "CenaAtualEmpalhada": return this.modificadorEnderecoCenaAtualEmpalhada(enderecoTexto);


            case "CenaAtualFlores": return this.modificadorEnderecoCenaAtualFlores(enderecoTexto);


            case "CenaAtualHall": return this.modificadorEnderecoCenaAtualHall(enderecoTexto);


            case "CenaAtualPatos": return this.modificadorEnderecoCenaAtualPatos(enderecoTexto);


            case "CenaAtualPorao": return this.modificadorEnderecoCenaAtualPorao(enderecoTexto);


            case "CenaAtualQuarto": return this.modificadorEnderecoCenaAtualQuarto(enderecoTexto);


            case "CenaAtualRGB": return this.modificadorEnderecoCenaAtualRGB(enderecoTexto);


            case "CenaAtualSegundoAndar": return  this.modificadorEnderecoCenaAtualSegundoAndar(enderecoTexto);


            default: return enderecoTexto;


        }

    }

    private String modificadorEnderecoCenaAtualBanheiro(String enderecoTexto) {
        switch ((CenaAtualBanheiro)personagem.getCenaAtual()){

            default: return enderecoTexto;
        }
    }
    private String modificadorEnderecoCenaAtualEmpalhada(String enderecoTexto) {
        switch ( (CenaAtualEmpalhada)personagem.getCenaAtual()){

            case LAREIRA: {
                if (personagem.getEventos().find("Apagou lareira").isAtivo()){
                    enderecoTexto = enderecoTexto.replace(".txt", "( Apagou lareira).txt");

                    if (personagem.getInventario().isPegouItem("Foto semi-Queimada") ||
                            personagem.getInventario().isPegouItem("chave Enferrujada")){

                        if (personagem.getInventario().isPegouItem("Foto semi-Queimada") &&
                                personagem.getInventario().isPegouItem("chave Enferrujada") ){

                            enderecoTexto = enderecoTexto.replace(".txt","( sem item).txt");
                        }else {
                            if (personagem.getInventario().isPegouItem("Foto semi-Queimada")){

                                enderecoTexto = "FALTA.txt";
                            }
                            if (personagem.getInventario().isPegouItem("chave Enferrujada")){

                                enderecoTexto = "FALTA.txt";
                            }
                        }

                    }
                }

                return enderecoTexto;


            }

            case MESA_DE_CANTO:{

                if (personagem.getEventos().find("Abriu mesa sala empalhada").isAtivo()){

                    enderecoTexto = enderecoTexto.replace(".txt", "( aberto).txt");
                    if (personagem.getInventario().isPegouItem("testamento")){
                        enderecoTexto = "FALTA.txt";
                    }
                }
                return enderecoTexto;
            }

            case SALA_EMPALHADA:{
                if (personagem.getInteracoes().getInteracao("SalaEmpalhada").isPrimeiraVez()){

                    enderecoTexto = enderecoTexto.replace(".txt", "( primeira vez).txt");
                    if (personagem.getEventos().find("Morte urso").isAtivo()){
                        enderecoTexto = enderecoTexto.replace(".txt", "( Morte urso).txt");

                    }
                }
                return enderecoTexto;
            }


            default: return enderecoTexto;


        }
    }

    private String modificadorEnderecoCenaAtualFlores(String enderecoTexto) {
        switch ((CenaAtualFlores)personagem.getCenaAtual()){

            case SENTAR_CADEIRA_FLORES,OLHAR_MESA_FLORES:{
                if (personagem.getInventario().isPegouItem("Prontuario médico")){
                    enderecoTexto = enderecoTexto.replace(".txt", "( pegou Prontuario médico).txt");
                }

            }

            case SALA_FLORES:{

                if (personagem.getInteracoes().getInteracao("SalaPatos").isPrimeiraVez()){

                    enderecoTexto = "FALTA.txt";
                }

            }

            default: return enderecoTexto;

        }
    }

    private String modificadorEnderecoCenaAtualHall(String enderecoTexto) {
        switch ((CenaAtualHall)personagem.getCenaAtual()){

            case GAVETA2: {
                if (personagem.getInventario().isPegouItem("chave Enferrujada")){
                    return "FALTA.txt";
                }
                return enderecoTexto;
            }

            case HALL: return enderecoTexto;

            case MESA_HALL: {
                if (personagem.getInventario().isPegouItem("Panfleto Museu")){
                    return "FALTA.txt";
                }
                return "FALTA.txt";
            }

            default: return enderecoTexto;

        }
    }

    private String modificadorEnderecoCenaAtualPatos(String enderecoTexto) {
        switch ((CenaAtualPatos)personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }

    private String modificadorEnderecoCenaAtualPorao(String enderecoTexto) {
        switch ((CenaAtualPorao)personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }

    private String modificadorEnderecoCenaAtualQuarto(String enderecoTexto) {
        switch ((CenaAtualQuarto)personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }

    private String modificadorEnderecoCenaAtualRGB(String enderecoTexto) {
        switch ((CenaAtualRGB)personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }

    private String modificadorEnderecoCenaAtualSegundoAndar(String enderecoTexto) {
        switch ((CenaAtualSegundoAndar)personagem.getCenaAtual()){

            default: return enderecoTexto;

        }
    }





}


