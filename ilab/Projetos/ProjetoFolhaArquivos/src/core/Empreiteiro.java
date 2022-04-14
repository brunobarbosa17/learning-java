package core;

public class Empreiteiro extends Funcionario {

  private double valorEmpreita;

  public Empreiteiro(int tipo, int id, String nome, double valorEmpreita) {
    super(tipo, id, nome);
    this.valorEmpreita = valorEmpreita;
  }

  public double getValorEmpreita() {
    return valorEmpreita;
  }

  public void setValorEmpreita(double valorEmpreita) {
    this.valorEmpreita = valorEmpreita;
  }
}
