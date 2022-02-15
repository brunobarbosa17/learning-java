package br.com.core;

public abstract class Cartao {

  protected String numeroCartao;
  protected String nomeTitular;
  protected int anoValidade;
  protected int mesValidade;
  protected double saldo;

  public Cartao(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
    this.numeroCartao = numeroCartao;
    this.nomeTitular = nomeTitular;
    this.anoValidade = anoValidade;
    this.mesValidade = mesValidade;
    this.saldo = saldo;
  }

  public void adicionarCredito(double valor) {
    setSaldo(getSaldo() + valor);
  }

  public boolean comprar(double valor) {
    if(getSaldo() >= valor) {
      setSaldo(getSaldo() - valor);
      return true;
    } else {
      return false;
    }
  }

  public String getNumeroCartao() {
    return numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public String getNomeTitular() {
    return nomeTitular;
  }

  public void setNomeTitular(String nomeTitular) {
    this.nomeTitular = nomeTitular;
  }

  public int getAnoValidade() {
    return anoValidade;
  }

  public void setAnoValidade(int anoValidade) {
    this.anoValidade = anoValidade;
  }

  public int getMesValidade() {
    return mesValidade;
  }

  public void setMesValidade(int mesValidade) {
    this.mesValidade = mesValidade;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
