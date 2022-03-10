package br.com.ui;
import br.com.core.*;
import javax.swing.*;

public class Main {
  public static void main(String[] args) {

    Cartao cartao = null;
    JOptionPane.showMessageDialog(null, "Bem-vindo a criação do seu cartão!");
    String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
    int tipoCartao;

    do {
      tipoCartao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Cartão Pré Pago\nDigite 2 para Cartão com CashBack"));
      switch (tipoCartao) {
        case 1:
          cartao = new CartaoPrePago("1234", nome, 2025, 12, 1000);
          break;
        case 2:
          int tipoCashback = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para benefício Bronze\nDigite 1 para benefício Prata\nDigite 2 para benefício Gold: "));
          cartao = new CartaoCashBack("1234", nome, 2025, 12, 1000, tipoCashback);
          break;
        default:
          break;
      }

    } while (tipoCartao < 0 || tipoCartao > 2);

    int oQueFazer;

    do {
      oQueFazer = Integer.parseInt(JOptionPane.showInputDialog("Você possui R$" + cartao.getSaldo() + " de crédito\nDigite 1 para adicionar crédito\nDigite 2 para fazer uma compra\nDigite 0 para encerrar!"));

      if (oQueFazer == 1) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja adicionar de crédito: "));
        cartao.adicionarCredito(valor);
        JOptionPane.showMessageDialog(null, "Crédito adicionado com sucesso!");
      }

      if(oQueFazer == 2) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
        if(cartao.comprar(valor)) {
          JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");

        } else {
          JOptionPane.showMessageDialog(null, "Você não possui saldo!!");

        }
      }

    } while (oQueFazer != 0);


  }
}
