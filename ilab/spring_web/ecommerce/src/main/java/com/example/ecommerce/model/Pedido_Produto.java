package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "pedido_produto")
public class Pedido_Produto {

  @Column(name = "num_seq", nullable = false, unique = true) @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer num_seq;


  private Integer cod_produto;


  private Integer num_pedido;

  @Column(name = "quantidade")
  private Integer quantidade;

  @Column(name = "preco_unit")
  private Double preco_unit;

  @Column(name = "preco_total")
  private Double preco_total;

  public Integer getNum_seq() {
    return num_seq;
  }
  public void setNum_seq(Integer num_seq) {
    this.num_seq = num_seq;
  }
  public Integer getCod_produto() {
    return cod_produto;
  }
  public void setCod_produto(Integer cod_produto) {
    this.cod_produto = cod_produto;
  }
  public Integer getNum_pedido() {
    return num_pedido;
  }
  public void setNum_pedido(Integer num_pedido) {
    this.num_pedido = num_pedido;
  }
  public Integer getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }
  public Double getPreco_unit() {
    return preco_unit;
  }
  public void setPreco_unit(Double preco_unit) {
    this.preco_unit = preco_unit;
  }
  public Double getPreco_total() {
    return preco_total;
  }
  public void setPreco_total(Double preco_total) {
    this.preco_total = preco_total;
  }
}
