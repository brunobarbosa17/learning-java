package br.com.core;

public class Chefe extends Funcionario {

  protected float salarioBase;
  protected float adicionalFuncao;
  protected float beneficioTerno;

  @Override
  public float calcularSalario() {
    return this.salarioBase + (this.salarioBase * (this.adicionalFuncao / 100)) + beneficioTerno;
  }

  public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
    super(nome, numeroRegistro);
    this.salarioBase = salarioBase;
    this.adicionalFuncao = adicionalFuncao;
    this.beneficioTerno = beneficioTerno;
  }

  public float getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(float salarioBase) {
    this.salarioBase = salarioBase;
  }

  public float getAdicionalFuncao() {
    return adicionalFuncao;
  }

  public void setAdicionalFuncao(float adicionalFuncao) {
    this.adicionalFuncao = adicionalFuncao;
  }

  public float getBeneficioTerno() {
    return beneficioTerno;
  }

  public void setBeneficioTerno(float beneficioTerno) {
    this.beneficioTerno = beneficioTerno;
  }
}
