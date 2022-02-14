package br.com.gomoscorp.core;

public class ContaEspecial extends Conta {

  protected float limite;

  public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo) {
    super(nomeTitular, cpf, numeroConta, saldo);
  }

  @Override
  public boolean debitar(float valor) {
    super.setSaldo(super.getSaldo() - valor);
    return true;
  }
}
