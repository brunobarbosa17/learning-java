package br.com.gomoscorp.ui;


import br.com.gomoscorp.core.Conta;
import br.com.gomoscorp.core.ContaEspecial;

public class Main {
  public static void main(String[] args) {

    Conta contaBruno = new Conta("Bruno", "531", 123, 500);
    contaBruno.exibirInfo();
    contaBruno.debitar(501);
    contaBruno.exibirInfo();

    ContaEspecial contaBrunoEspecial = new ContaEspecial("Bruninho", "31413", 150, 300);
    contaBrunoEspecial.debitar(500);
    contaBrunoEspecial.exibirInfo();
  }
}
