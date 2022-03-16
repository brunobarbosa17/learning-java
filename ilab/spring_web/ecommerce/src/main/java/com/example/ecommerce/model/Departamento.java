package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity /* Entity - Classes que são mapeadas para uma tabela */
@Table(name="departamento") // Especificando que o nome da tabela no banco tem que ser igual ao parametro name
public class Departamento {

  @Id						   // mostra que o atributo é uma PK
  @Column(name = "numero")   // mapeio o atributo "numero" para a especificação da coluna "numero" na tabela
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Indico que o valor é gerado e gerenciado pelo BD ( e o identity torna isso indepentende da implementação)
  private Integer numero;

  @Column(name = "nome", length = 50, nullable = false)
  private String  nome;

  @Column(name = "andar")
  private Integer andar;

  @OneToMany(mappedBy = "depto")
  @JsonIgnoreProperties("depto")
  private List<Produto> listaProdutos;


  public List<Produto> getListaProdutos() {
    return listaProdutos;
  }
  public void setListaProdutos(List<Produto> listaProdutos) {
    this.listaProdutos = listaProdutos;
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
  public Integer getAndar() {
    return andar;
  }
  public void setAndar(Integer andar) {
    this.andar = andar;
  }
}
