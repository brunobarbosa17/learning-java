package com.example.exemploconexxao;

public class Departamento {

  private int id;
  private String nome;
  private int andar;

  public Departamento(int id, String nome, int andar) {
    this.id = id;
    this.nome = nome;
    this.andar = andar;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAndar() {
    return andar;
  }

  public void setAndar(int andar) {
    this.andar = andar;
  }

  @Override
  public String toString() {
    return "Departamento{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", andar=" + andar +
            '}';
  }
}
