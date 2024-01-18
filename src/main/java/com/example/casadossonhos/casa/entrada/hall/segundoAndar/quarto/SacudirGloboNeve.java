package com.example.casadossonhos.casa.entrada.hall.segundoAndar.quarto;

import com.example.casadossonhos.Comandos.alerta.QuebrarGloboDeNeve;
import com.example.casadossonhos.Comandos.alerta.SacudirGloboNeveNovamente;
import com.example.casadossonhos.Jogador.Personagem;
import com.example.casadossonhos.casa.Cena;
import com.example.casadossonhos.casa.CenaAtual.CenaAtualQuarto;

public class SacudirGloboNeve extends Cena {
    public SacudirGloboNeve(Personagem personagem) {
        super(personagem);
    }

    @Override
    public void guardarEnderecoTexto() {

    }

    @Override
    public void aoClicarBotao() {
        super.aoClicarBotao();
        botoes.desativarVoltar(pane);

        botoes.criaAlerta(new QuebrarGloboDeNeve(this.getPersonagem()),"Quebrar o globo de neve");

        if(!this.getPersonagem().getInventario().isPegouItem("Globo de neve")){
            botoes.pegarItem("Globo de neve","Guardar o globo de neve").
                    funcaoBotao(new Quarto(this.getPersonagem()),"Guardar o globo de neve");
        }

        botoes.criaAlerta(new SacudirGloboNeveNovamente(), "sacudir novamente o globo de neve");

        botoes.funcaoBotao(new ArmarioQuarto(this.getPersonagem()),"Deixar o globo de neve");
    }

    @Override
    public void cenaAtual() {
        this.getPersonagem().setCenaAtual(CenaAtualQuarto.SACUDIR_GLOBO_DE_NEVE);

    }
}
