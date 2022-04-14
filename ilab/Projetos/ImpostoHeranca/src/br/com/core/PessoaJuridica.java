package br.com.core;

public class PessoaJuridica extends Contribuinte {

  protected String cnpj;
  protected double faturamento;


  public PessoaJuridica(String nome, String endereco, double faturamento, String cnpj) {
    super(nome, endereco);
    this.faturamento = faturamento;
    this.cnpj = cnpj;
  }

  @Override
  public int calcularImposto() {
    if(faturamento < 100000) {
      return 0;
    } else if (faturamento < 250000) {
      return 6;
    } else if (faturamento < 450000) {
      return 15;
    } else {
      return 25;
    }
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public double getFaturamento() {
    return faturamento;
  }

  public void setFaturamento(double faturamento) {
    this.faturamento = faturamento;
  }
}
