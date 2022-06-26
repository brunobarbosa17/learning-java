package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
    
  public static void main(String[] args) {
   
    ContaCorrente conta1 = new ContaCorrente(123,123);
    ContaCorrente conta2 = new ContaCorrente(123,123);

    Integer idade = Integer.valueOf(999);

    Number numero = 1;
    short t = 011;
    System.out.println(t);
    
    System.out.println(idade);
    System.out.println(conta1.equals(conta2));
    System.out.println(Boolean.FALSE);
    System.out.println(Boolean.TRUE);
  }

}