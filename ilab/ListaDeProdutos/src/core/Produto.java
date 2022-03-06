package core;

public class Produto {
  protected int id;
  protected String descricao;
  protected double preco;
  protected int qntdEstoque;

  public Produto(int id, String descricao, double preco, int qntdEstoque) {
    this.id = id;
    this.descricao = descricao;
    this.preco = preco;
    this.qntdEstoque = qntdEstoque;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQntdEstoque() {
    return qntdEstoque;
  }

  public void setQntdEstoque(int qntdEstoque) {
    this.qntdEstoque = qntdEstoque;
  }

  @Override
  public String toString() {
    return "Produto{" +
            "id=" + id +
            ", descricao='" + descricao + '\'' +
            ", preco=" + preco +
            ", qntdEstoque=" + qntdEstoque +
            '}';
  }
}