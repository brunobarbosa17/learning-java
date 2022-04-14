package br.com.core;

public class Empreiteiro extends Funcionario {

  protected float valorEmpreita;

  @Override
  public float calcularSalario() {
    return valorEmpreita;
  }

  public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
    super(nome, numeroRegistro);
    this.valorEmpreita = valorEmpreita;
  }

  public float getValorEmpreita() {
    return valorEmpreita;
  }

  public void setValorEmpreita(float valorEmpreita) {
    this.valorEmpreita = valorEmpreita;
  }
}
