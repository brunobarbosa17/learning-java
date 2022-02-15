package br.com.core;

public class CartaoCashBack extends Cartao {

  protected int tipoCartao;
  protected double porcentagemVolta;

  public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
    super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
    switch (tipoCartao) {
      case 0:
        this.porcentagemVolta = 0.02;
        break;
      case 1:
        this.porcentagemVolta = 0.05;
        break;
      case 2:
        this.porcentagemVolta = 0.08;
        break;
    }
  }

  public boolean comprar(double valor) {
    if (super.getSaldo() >= valor) {
      double volta = valor * porcentagemVolta;
      super.setSaldo(getSaldo() - valor + volta);
      return true;
    } else {
      return false;
    }
  }
}
