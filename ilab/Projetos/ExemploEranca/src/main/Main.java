package main;

import core.*;

public class Main {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("Bruno", "bruno@teste.com", "3134431");

    Estudante e = new Estudante("Lucas", "lucas@teste.com" ,"1212", 3414);

    e.mostrar();
    p.mostrar();
  }
}
