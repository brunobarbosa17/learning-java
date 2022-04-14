public class Cliente {
  private double creditos;
  private String nome;

  public Cliente(double creditos, String nome) {
    this.creditos = creditos;
    this.nome = nome;
  }

  public double getCreditos() {
    return creditos;
  }

  public void setCreditos(double creditos) {
    this.creditos = creditos;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String finalizarCompra() {
    return "Compra finalizada!";
  }

  public boolean efetuarCompra(double preco) {
    if (getCreditos() >= preco) {
      setCreditos(getCreditos() - preco);
      return true;
    } else {
      return false;
    }
  }
}
