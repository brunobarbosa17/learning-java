package br.com.root;

public abstract class QuestaoSimples {
    protected String enunciado;
    protected String resposta;

    public String aplicarQuestao() {
        return this.enunciado;
    }

    public boolean corrigirQuestao(String resposta) {
        return resposta.equals(this.resposta);
    }

    public QuestaoSimples(String enunciado, String resposta) {
        this.enunciado = enunciado;
        this.resposta = resposta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
