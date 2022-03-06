package br.com.core;

public class Comissionado extends Funcionario {

  protected float salarioBase;
  protected float comissao;

  @Override
  public float calcularSalario() {
    return this.salarioBase + (this.salarioBase * (comissao / 100));
  }

  public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
    super(nome, numeroRegistro);
    this.salarioBase = salarioBase;
    this.comissao = comissao;
  }

  public float getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(float salarioBase) {
    this.salarioBase = salarioBase;
  }

  public float getComissao() {
    return comissao;
  }

  public void setComissao(float comissao) {
    this.comissao = comissao;
  }
}
