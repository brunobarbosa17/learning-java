package br.com.gomocorp.userinterface;

import br.com.gomocorp.core.MaquinaDeGasolina;

public class Main {
  public static void main(String[] args) {

    MaquinaDeGasolina maquina = new MaquinaDeGasolina(5.00, 100, "Petrobras");

    maquina.abastecerPorLitros(2);
    maquina.abastecerPorReais(50);
  }
}
