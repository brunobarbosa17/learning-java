package br.com.ui;

import br.com.core.Contribuinte;
import br.com.core.PessoaFisica;
import br.com.core.PessoaJuridica;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Bem-vindo a calculadora de Imposto de Renda!");
    String nome = JOptionPane.showInputDialog("Digite o seu nome:");
    String endereco = JOptionPane.showInputDialog("Digite o seu endereço:");
    double rendimentoAnual = Double.parseDouble(JOptionPane.showInputDialog( "Digite a sua renda anual:"));
    int tipoPessoa = Integer.parseInt(JOptionPane.showInputDialog( "Digite 1 se for Pessoa Física\nDigite 2 se for Pessoa Jurídica"));

    Contribuinte contribuinte = null;

    switch (tipoPessoa) {
      case 1:
        String cpf = JOptionPane.showInputDialog("Digite o seu CPF:");
        int dependentes = Integer.parseInt(JOptionPane.showInputDialog( "Digite quantos dependentes possui: "));
        contribuinte = new PessoaFisica(nome, endereco, cpf, rendimentoAnual, dependentes);
        break;
      case 2:
        String cnpj = JOptionPane.showInputDialog("Digite o seu CNPJ");
        contribuinte = new PessoaJuridica(nome, endereco, rendimentoAnual, cnpj);
        break;
      default:
        break;
    }

    JOptionPane.showMessageDialog(null, "Olá " + nome + ", com a sua renda atual, você terá " + contribuinte.calcularImposto() + "% de imposto ao declarar!");
  }


}
