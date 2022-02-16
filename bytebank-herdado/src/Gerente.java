public class Gerente extends FuncionarioAutenticavel {

  @Override
  public double getBonificacao() {
    System.out.println("Bonificando Gerente");
    return super.getSalario();
  }

}
