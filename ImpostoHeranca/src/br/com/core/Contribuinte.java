package br.com.core;

public abstract class Contribuinte {

  protected int numeroCadastral;
  protected String nome;
  protected String endereco;


  public Contribuinte(String nome, String endereco) {
    this.nome = nome;
    this.endereco = endereco;
  }

  public abstract int calcularImposto();

  public int getNumeroCadastral() {
    return numeroCadastral;
  }

  public void setNumeroCadastral(int numeroCadastral) {
    this.numeroCadastral = numeroCadastral;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
}
