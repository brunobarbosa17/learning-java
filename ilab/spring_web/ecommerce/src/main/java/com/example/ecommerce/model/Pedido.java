package com.example.ecommerce.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedido")
public class Pedido {

  @Id @Column(name = "numero", unique = true)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer numero;

  @Column(name = "data")
  private LocalDateTime data;

  @Column(name = "valor_bruto")
  private Double valor_bruto;

  @Column(name = "desconto")
  private Double desconto;

  @Column(name = "valor_total")
  private Double valor_total;

  @Column(name = "num_cliente", nullable = false)
  private Integer num_cliente;

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public LocalDateTime getData() {
    return data;
  }

  public void setData(LocalDateTime data) {
    this.data = data;
  }

  public Double getValor_bruto() {
    return valor_bruto;
  }

  public void setValor_bruto(Double valor_bruto) {
    this.valor_bruto = valor_bruto;
  }

  public Double getDesconto() {
    return desconto;
  }

  public void setDesconto(Double desconto) {
    this.desconto = desconto;
  }

  public Double getValor_total() {
    return valor_total;
  }

  public void setValor_total(Double valor_total) {
    this.valor_total = valor_total;
  }

  public Integer getNum_cliente() {
    return num_cliente;
  }

  public void setNum_cliente(Integer num_cliente) {
    this.num_cliente = num_cliente;
  }
}
