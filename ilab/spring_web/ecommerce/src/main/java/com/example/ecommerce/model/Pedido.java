package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

  @Id
  @Column(name="numero")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer numero;

  @Column(name = "data")
  private LocalDate data;

  @Column(name = "valor_bruto")
  private Double valorBruto;

  @Column(name = "desconto")
  private Double desconto;

  @Column(name = "valor_total")
  private Double valorTotal;

  @ManyToOne
  @JoinColumn(name = "num_cliente")
  @JsonIgnoreProperties("listaPedidos")
  private Cliente cliente;

  @OneToMany(mappedBy = "pedido")
  @JsonIgnoreProperties("pedido")
  private List<ItemPedido> itens;

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Double getValorBruto() {
    return valorBruto;
  }

  public void setValorBruto(Double valorBruto) {
    this.valorBruto = valorBruto;
  }

  public Double getDesconto() {
    return desconto;
  }

  public void setDesconto(Double desconto) {
    this.desconto = desconto;
  }

  public Double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(Double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public List<ItemPedido> getItens() {
    return itens;
  }

  public void setItens(List<ItemPedido> itens) {
    this.itens = itens;
  }




}