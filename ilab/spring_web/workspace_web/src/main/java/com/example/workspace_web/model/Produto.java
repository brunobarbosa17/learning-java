package com.example.workspace_web.model;

public class Produto {

  private int Id;
  private String descricao;
  private double preco;
  private int quantidadeEstoque;
  private String linkFoto;



  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidadeEstoque() {
    return quantidadeEstoque;
  }

  public void setQuantidadeEstoque(int quantidadeEstoque) {
    this.quantidadeEstoque = quantidadeEstoque;
  }

  public String getLinkFoto() {
    return linkFoto;
  }

  public void setLinkFoto(String linkFoto) {
    this.linkFoto = linkFoto;
  }
}
