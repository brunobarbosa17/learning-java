package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
  public void calcularReajuste(Funcionario funcionario, Desempenho desempenho) {
    BigDecimal percentualReajuste = desempenho.percentualReajuste();
    BigDecimal reajuste = funcionario.getSalario().multiply(percentualReajuste);

    funcionario.reajustarSalario(reajuste);

  }
}
