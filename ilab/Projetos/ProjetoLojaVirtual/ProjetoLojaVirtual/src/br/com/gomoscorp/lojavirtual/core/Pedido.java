package br.com.gomoscorp.lojavirtual.core;

public class Pedido {
  private String data;
  private Cliente cliente;
  private Produto produto;

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public String exibir() {
    return "Cliente : " + getCliente() + "\nData: " + getData() + "\nProduto: " + getProduto();
  }

}
