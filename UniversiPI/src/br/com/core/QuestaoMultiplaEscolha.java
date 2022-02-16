package br.com.core;

import br.com.root.QuestaoSimples;

public class QuestaoMultiplaEscolha extends QuestaoSimples {

    protected String alternativa1;
    protected String alternativa2;
    protected String alternativa3;
    protected String alternativa4;

    public QuestaoMultiplaEscolha(String enunciado, String resposta, String alternativa1, String alternativa2, String alternativa3, String alternativa4) {
        super(enunciado, resposta);
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
    }

    @Override
    public String aplicarQuestao() {
        return super.aplicarQuestao() +
                "\nAlternativas : \n" +
                alternativa1 + "\n" + alternativa2 +"\n" + alternativa3 +"\n" + alternativa4;
    }

    public String getAlternativas() {
        return "QuestaoMultiplaEscolha{" +
                "alternativa1='" + alternativa1 + '\'' +
                ", alternativa2='" + alternativa2 + '\'' +
                ", alternativa3='" + alternativa3 + '\'' +
                ", alternativa4='" + alternativa4 + '\'' +
                '}';
    }

}
