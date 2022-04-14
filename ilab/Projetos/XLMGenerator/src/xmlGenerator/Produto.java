package xmlGenerator;

public class Produto {

  private String descricao;
  private double preco;
  private int id;
  private String linkFoto;

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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLinkFoto() {
    return linkFoto;
  }

  public void setLinkFoto(String linkFoto) {
    this.linkFoto = linkFoto;
  }

  @Override
  public String toString() {
    return "Produto{" +
            "descricao='" + descricao + '\'' +
            ", preco=" + preco +
            ", id=" + id +
            ", linkFoto='" + linkFoto + '\'' +
            '}';
  }
}
