package core;

public class Comissionado extends Funcionario {

  private double salarioBase;
  private double comissao;


  public Comissionado(int tipo, int id, String nome,
                      double salarioBase, double comissao) {
    super(tipo, id, nome);
    this.salarioBase = salarioBase;
    this.comissao = comissao;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }
}
