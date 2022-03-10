package com.example.exemploconexxao;

public class TesteConexao {

  public static void main(String[] args) {
    DepartamentoDAO depto = new DepartamentoDAO();

    System.out.println(depto.readAll());
  }
}
