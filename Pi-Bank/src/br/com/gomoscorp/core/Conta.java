package br.com.gomoscorp.core;

public class Conta {

  protected String nomeTitular;
  protected String cpf;
  protected int numeroConta;
  protected float saldo;

  public Conta(String nomeTitular, String cpf, int numeroConta, float saldo) {
    setNomeTitular(nomeTitular);
    setCpf(cpf);
    setNumeroConta(numeroConta);
    setSaldo(saldo);
  }

  public boolean debitar(float valor) {
    if(getSaldo() >= valor) {
      setSaldo(getSaldo() - valor);
      return true;
    } else {
      return false;
    }
  }

  public void creditar(float valor) {
    setSaldo(getSaldo() + valor);
  }

  public void exibirInfo() {
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("+ Olá, bem vindo " + getNomeTitular() + "              +");
    System.out.printf("+ Seu saldo é R$%.2f                +\n", getSaldo());
    System.out.printf("+ E o número da sua conta é: %d       +\n", getNumeroConta());
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

  }

  public String getNomeTitular() {
    return nomeTitular;
  }

  public void setNomeTitular(String nomeTitular) {
    this.nomeTitular = nomeTitular;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
}
