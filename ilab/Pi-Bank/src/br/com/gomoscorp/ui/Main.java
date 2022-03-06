package br.com.gomoscorp.ui;


import br.com.gomoscorp.core.Conta;
import br.com.gomoscorp.core.ContaEspecial;
import br.com.gomoscorp.exception.ContaException;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {
      String nome = sc.nextLine();
      String cpf = sc.nextLine();
      String numeroConta = sc.nextLine();
      String saldo = sc.nextLine();
      Conta contaBruno = new Conta(nome, cpf, Integer.parseInt(numeroConta), Float.parseFloat(saldo));
      contaBruno.exibirInfo();
      contaBruno.debitar(501);
      contaBruno.debitar(2000);
      contaBruno.exibirInfo();

    } catch (ContaException e) {
      System.err.println(e.getMessage());
    }

  }
}
