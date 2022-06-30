package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

  private ReajusteService service;
  private Funcionario funcionario;

  @BeforeEach
  public void inicializa() {
    this.service = new ReajusteService();
    this.funcionario = new Funcionario("", LocalDate.now(), new BigDecimal("2000.00"));
  }

  @Test
  void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
    inicializa();
    service.calcularReajuste(funcionario, Desempenho.A_DESEJAR);
    assertEquals(new BigDecimal("2060.00"), funcionario.getSalario());
  }

  @Test
  void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
    inicializa();
    service.calcularReajuste(funcionario, Desempenho.BOM);
    assertEquals(new BigDecimal("2300.00"), funcionario.getSalario());
  }

  @Test
  void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {
    inicializa();
    service.calcularReajuste(funcionario, Desempenho.OTIMO);
    assertEquals(new BigDecimal("2400.00"), funcionario.getSalario());
  }
}
