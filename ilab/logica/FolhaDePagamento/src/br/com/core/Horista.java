package br.com.core;

public class Horista extends Funcionario {

  protected float valorHora;
  protected int numeroHoras;

  @Override
  public float calcularSalario() {
    return valorHora * numeroHoras;
  }

  public Horista(String nome, int numeroRegistro, float valorHora, int numeroHoras) {
    super(nome, numeroRegistro);
    this.valorHora = valorHora;
    this.numeroHoras = numeroHoras;
  }

  public float getValorHora() {
    return valorHora;
  }

  public void setValorHora(float valorHora) {
    this.valorHora = valorHora;
  }

  public int getNumeroHoras() {
    return numeroHoras;
  }

  public void setNumeroHoras(int numeroHoras) {
    this.numeroHoras = numeroHoras;
  }
}
