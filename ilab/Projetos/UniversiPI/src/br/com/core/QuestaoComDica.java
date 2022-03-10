package br.com.core;

import br.com.root.QuestaoSimples;

public class QuestaoComDica extends QuestaoSimples {

    protected String dica;

    public QuestaoComDica(String enunciado, String resposta, String dica) {
        super(enunciado, resposta);
        this.dica = dica;
    }

    @Override
    public String aplicarQuestao() {
        return super.aplicarQuestao() +
                "\nDica : " + this.dica;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
}
