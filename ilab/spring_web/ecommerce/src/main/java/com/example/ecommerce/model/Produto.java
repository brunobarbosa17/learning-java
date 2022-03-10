package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

  @Column(name = "codigo", nullable = false, unique = true) @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer codigo;

  @Column(name = "nome", nullable = false, length = 50)
  private String nome;

  @Column(name = "descricao")
  private String descricao;

  @Column(name = "preco")
  private Double preco;

  @Column(name = "quantidade_estoque")
  private Integer quantidade_estoque;

  @Column(name = "link_foto", length = 255)
  private String link_foto;

  @ManyToOne
  @JoinColumn(name = "num_depto")
  private Departamento depto;

  public Departamento getDepto() {
		return depto;
	}

	public void setDepto(Departamento depto) {
		this.depto = depto;
	}

	public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public Integer getQuantidade_estoque() {
    return quantidade_estoque;
  }

  public void setQuantidade_estoque(Integer quantidade_estoque) {
    this.quantidade_estoque = quantidade_estoque;
  }

  public String getLink_foto() {
    return link_foto;
  }

  public void setLink_foto(String link_foto) {
    this.link_foto = link_foto;
  }

  
}
