public class TesteFuncionario {
  public static void main(String[] args) {

    Funcionario nico = new Funcionario();

    nico.setNome("Nico");
    nico.setCpf("5165959");
    nico.setSalario(5000);

    System.out.println(nico.getNome());
    System.out.println(nico.getBonificacao());
    System.out.println(nico.getSalario());

  }
}
