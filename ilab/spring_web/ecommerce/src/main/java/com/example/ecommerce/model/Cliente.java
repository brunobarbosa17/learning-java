package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {
  @Id
  @Column(name = "numero")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer numero;

  @Column(name = "nome", length = 100, nullable = false)
  private String nome;

  @Column(name = "cpf", length = 11, nullable = false, unique = true)
  private String cpf;

  @Column(name="email", length = 50, nullable = false, unique = true)
  private String email;

  @Column(name = "telefone", nullable = false)
  private Integer telefone;

  @Column(name = "logradouro", length = 50,  nullable = false)
  private String logradouro;

  @Column(name = "num_res")
  private Integer numRes;

  @Column(name = "compl", length = 30)
  private String complemento;

  @Column(name = "bairro", length = 30)
  private String bairro;

  @Column(name = "cidade", length = 30)
  private String cidade;

  @Column(name = "estado", length = 2, nullable = false)
  private String estado;

  @Column(name = "cep", length = 8)
  private String cep;

  @OneToMany(mappedBy = "cliente")
  @JsonIgnoreProperties("cliente")
  private List<Pedido> listaPedidos;


  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getTelefone() {
    return telefone;
  }

  public void setTelefone(Integer telefone) {
    this.telefone = telefone;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public Integer getNumRes() {
    return numRes;
  }

  public void setNumRes(Integer numRes) {
    this.numRes = numRes;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public List<Pedido> getListaPedidos() {
    return listaPedidos;
  }

  public void setListaPedidos(List<Pedido> listaPedidos) {
    this.listaPedidos = listaPedidos;
  }
}
