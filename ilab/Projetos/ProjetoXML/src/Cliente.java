public class Cliente {
  private int codigo;
  private String nome;
  private String email;
  private String whatsapp;
  private String dataNasc;

  public Cliente(int codigo, String nome, String email, String whatsapp, String dataNasc) {
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.email = email;
    this.whatsapp = whatsapp;
    this.dataNasc = dataNasc;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getWhatsapp() {
    return whatsapp;
  }

  public void setWhatsapp(String whatsapp) {
    this.whatsapp = whatsapp;
  }

  public String getDataNasc() {
    return dataNasc;
  }

  public void setDataNasc(String dataNasc) {
    this.dataNasc = dataNasc;
  }



}