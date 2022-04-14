package core;

public abstract class Funcionario {
  protected int tipo;
  protected int id;
  protected String nome;

  public Funcionario(int tipo, int id, String nome) {
    this.tipo = tipo;
    this.id = id;
    this.nome = nome;
  }

  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
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

}
