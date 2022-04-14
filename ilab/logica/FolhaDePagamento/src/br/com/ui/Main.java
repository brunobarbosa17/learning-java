package br.com.ui;

import br.com.core.*;

public class Main {
  public static void main(String[] args) {

    Funcionario[] listaFuncionarios = new Funcionario[4];

    listaFuncionarios[0] = new Chefe("Bruno", 123, 3000, 250, 250);
    listaFuncionarios[1] = new Comissionado("Lucas", 124, 2500, 150);
    listaFuncionarios[2] = new Horista("Fernando", 125, 25, 8);
    listaFuncionarios[3] = new Empreiteiro("João", 126, 800);

    for (Funcionario funcionario: listaFuncionarios) {
      System.out.println("==============================================================");
      System.out.println("+   Seu nome: " + funcionario.getNome());
      System.out.println("+   Sua função: " + funcionario.getClass());
      System.out.println("+   Seu registro: "+ funcionario.getNumeroRegistro());
      System.out.println("+   Seu salário a receber: R$"+ funcionario.calcularSalario());
      System.out.println("==============================================================");


    }

  }
}
