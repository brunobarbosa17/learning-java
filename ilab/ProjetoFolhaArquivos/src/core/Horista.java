package core;

public class Horista extends Funcionario {

  private double numeroHoras;
  private double valorHora;

  public Horista(int tipo, int id, String nome,
                 double numeroHoras, double valorHora) {
    super(tipo, id, nome);
    this.numeroHoras = numeroHoras;
    this.valorHora = valorHora;
  }

  public double getNumeroHoras() {
    return numeroHoras;
  }

  public void setNumeroHoras(double numeroHoras) {
    this.numeroHoras = numeroHoras;
  }

  public double getValorHora() {
    return valorHora;
  }

  public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
  }
}
