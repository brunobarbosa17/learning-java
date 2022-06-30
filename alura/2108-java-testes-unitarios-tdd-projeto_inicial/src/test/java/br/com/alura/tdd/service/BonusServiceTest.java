package br.com.alura.tdd.service;


import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {


  @Test
  void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto() {
    BonusService service = new BonusService();
    assertThrows(IllegalArgumentException.class,
            () -> service.calcularBonus(
                    new Funcionario("",
                            LocalDate.now(),
                            new BigDecimal("10001"))));


  }

  @Test
  void bonusDeveriaSer10PorCentoDoSalario() {
    BonusService service = new BonusService();
    BigDecimal bonus = service.calcularBonus(new Funcionario("", LocalDate.now(), new BigDecimal("2500")));

    assertEquals(new BigDecimal("250.00"), bonus);
  }

  @Test
  void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente1000() {
    BonusService service = new BonusService();
    BigDecimal bonus = service.calcularBonus(new Funcionario("", LocalDate.now(), new BigDecimal("1000")));

    assertEquals(new BigDecimal("100.00"), bonus);
  }

}
