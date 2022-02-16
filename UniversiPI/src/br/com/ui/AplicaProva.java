package br.com.ui;

import br.com.core.QuestaoComDica;
import br.com.core.QuestaoMultiplaEscolha;
import br.com.root.QuestaoSimples;

import javax.swing.*;

public class AplicaProva {
    public static void main(String[] args) {

        QuestaoSimples[] listaQuestoes = new QuestaoSimples[4];

        listaQuestoes[0] = new QuestaoComDica("Qual linguagem aprendida no iLAB?", "Java", "J _ _ A");
        listaQuestoes[1] = new QuestaoMultiplaEscolha("Qual destas linguagens Isidro ensina no iLab??", "Java",
                "Python",
                "Javascript",
                "PHP",
                "Ruby");
        listaQuestoes[2] = new QuestaoComDica("Qual a cor dos cabelos pretos de Maria?", "Pretos", "Black");
        listaQuestoes[3] = new QuestaoMultiplaEscolha("Quanto é: 2 + 2 = ?", "4",
                "1",
                "2",
                "3",
                "4");

        JOptionPane.showMessageDialog(null, "Bem vindo ao GomosQuiz!!!");
        int pontuacao = 0;
        for (QuestaoSimples questao: listaQuestoes) {
            String resposta = JOptionPane.showInputDialog(questao.aplicarQuestao());
            if (questao.corrigirQuestao(resposta)) {
                pontuacao++;
            }
        }
        JOptionPane.showMessageDialog(null, "A sua pontuação foi: " + pontuacao);
    }
}
