package br.com.core;

public class PessoaFisica extends Contribuinte {

  protected String cpf;
  protected double rendimentoAnual;
  protected int dependentes;

  public PessoaFisica(String nome, String endereco, String cpf, double rendimentoAnual, int dependentes) {
    super(nome, endereco);
    this.cpf = cpf;
    this.rendimentoAnual = rendimentoAnual;
    this.dependentes = dependentes;
  }

  @Override
  public int calcularImposto() {
    double base = (getRendimentoAnual() - 1770) * ((getDependentes() == 0) ? 1 : getDependentes());
    if (base < 25000) {
      return 0;
    } else if (base < 50000) {
      return 15;
    } else if (base < 100000) {
      return 20;
    } else if (base > 100000) {
      return 27;
    } else {
      return 0;
    }
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public double getRendimentoAnual() {
    return rendimentoAnual;
  }

  public void setRendimentoAnual(double rendimentoAnual) {
    this.rendimentoAnual = rendimentoAnual;
  }

  public int getDependentes() {
    return dependentes;
  }

  public void setDependentes(int dependentes) {
    this.dependentes = dependentes;
  }
}
