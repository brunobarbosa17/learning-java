package br.com.core;

public class CartaoPrePago extends Cartao {

  public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
    super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
  }
}
