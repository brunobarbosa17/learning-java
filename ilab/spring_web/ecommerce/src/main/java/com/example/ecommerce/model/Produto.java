package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
  @Id
  @Column(name = "codigo")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer codigo;

  @Column(name = "nome", length = 50, nullable = false)
  private String nome;

  @Column(name = "descricao", columnDefinition = "TEXT")
  private String descricao;

  @Column(name = "preco")
  private Double preco;

  @Column(name="qtd_estoque")
  private Integer qtdEstoque;

  @Column(name="link_foto", length = 255)
  private String linkFoto;

  @ManyToOne					// esta anotação indica que há uma relação N:1 com Departamento
  @JoinColumn(name = "num_depto") // como o nome da coluna que é FK é diferente do nome da PK de Departamento, então preciso explicitar
  @JsonIgnoreProperties("listaProdutos")
  private Departamento depto;


  public Produto() {
    // nao faz nadica de nada!!!
  }

  public Produto(Integer codigo, String nome, String descricao, Double preco, Integer qtdEstoque, String linkFoto,
                 Integer numeroDepto, String nomeDepto, Integer andarDepto) {
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.qtdEstoque = qtdEstoque;
    this.linkFoto = linkFoto;
    this.depto = new Departamento();
    this.depto.setNumero(numeroDepto);
    this.depto.setNome(nomeDepto);
    this.depto.setAndar(andarDepto);
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

  public Integer getQtdEstoque() {
    return qtdEstoque;
  }

  public void setQtdEstoque(Integer qtdEstoque) {
    this.qtdEstoque = qtdEstoque;
  }

  public String getLinkFoto() {
    return linkFoto;
  }

  public void setLinkFoto(String linkFoto) {
    this.linkFoto = linkFoto;
  }

  public Departamento getDepto() {
    return depto;
  }

  public void setDepto(Departamento depto) {
    this.depto = depto;
  }

}
