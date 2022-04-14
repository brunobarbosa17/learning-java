public class TestaGetESet {
  public static void main(String[] args) {
    Conta conta = new Conta(123,123);
    conta.setNumero(1234);
    System.out.println(conta.getNumero());

    Cliente paulo = new Cliente();
    paulo.setNome("Paulo");
    conta.setTitular(paulo);

    System.out.println(conta.getTitular().getNome());

    conta.getTitular().setProfissao("dev");
  }
}
