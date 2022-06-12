public class Gerente extends Funcionario implements Autenticavel {

  private int senha;
  private final AutenticacaoUtil autenticador;

  public Gerente() {
    this.autenticador = new AutenticacaoUtil();
  }

  @Override
  public double getBonificacao() {
    System.out.println("Bonificando Gerente");
    return super.getSalario();
  }

  @Override
  public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
  }

  @Override
  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }
}
