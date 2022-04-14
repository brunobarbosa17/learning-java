package br.com.gomocorp.core;

public class MaquinaDeGasolina {

  private double preco;
  private double litros;
  private String nomeCombustivel;

  public MaquinaDeGasolina(double preco, double litros, String nomeCombustivel) {
    this.preco = preco;
    this.litros = litros;
    this.nomeCombustivel = nomeCombustivel;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double getLitros() {
    return litros;
  }

  public void setLitros(double litros) {
    this.litros = litros;
  }

  public String getNomeCombustivel() {
    return nomeCombustivel;
  }

  public void setNomeCombustivel(String nomeCombustivel) {
    this.nomeCombustivel = nomeCombustivel;
  }

  public void abastecerPorLitros(double litros) {
    System.out.printf("Obrigado, você abasteceu %.2f litros pagando R$%.2f\n", litros, (litros * getPreco()));
  }

  public void abastecerPorReais(double preco) {
    double litrosAbastecidos = preco / getPreco();
    System.out.printf("Obrigado, você abasteceu %.2f litros pagando R$%.2f\n", litrosAbastecidos, preco);
  }

}
