package com.example.ecommerce.dto;
import com.example.ecommerce.model.Cliente;

public class ClienteDTO {

  private Integer numero;
  private String nome;
  private String cpf;
  private String email;
  private Integer telefone;

  public ClienteDTO(Integer numero, String nome, String cpf, String email, Integer telefone) {
    super();
    this.numero = numero;
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.telefone = telefone;
  }

  public ClienteDTO(Cliente c) {
  }


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

  public static ClienteDTO fromCliente(Cliente c) {
    return new ClienteDTO(c.getNumero(), c.getNome(), c.getCpf(), c.getEmail(), c.getTelefone());
  }

}
