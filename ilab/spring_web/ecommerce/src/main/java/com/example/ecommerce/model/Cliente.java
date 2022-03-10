package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

  @Column(name = "numero", nullable = false) @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String numero;

  @Column(name = "nome", nullable = false, length = 100)
  private String nome;

  @Column(name = "cpf", nullable = false, unique = true)
  private String cpf;

  @Column(name="email", nullable = false, unique = true)
  private String email;

  @Column(name = "telefone", nullable = false)
  private Integer telefone;

  @Column(name = "logradouro", nullable = false, length = 50)
  private String logradouro;

  @Column(name = "numero_residencia")
  private int numero_residencia;

  @Column(name = "complemento", length = 30)
  private String complemento;

  @Column(name = "bairro", length = 30)
  private String bairro;

  @Column(name = "cidade", length = 30)
  private String cidade;

  @Column(name = "estado", nullable = false ,length = 2)
  private String estado;

  @Column(name = "cep", length = 8)
  private String cep;

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
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

  public int getNumero_residencia() {
    return numero_residencia;
  }

  public void setNumero_residencia(int numero_residencia) {
    this.numero_residencia = numero_residencia;
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
}
