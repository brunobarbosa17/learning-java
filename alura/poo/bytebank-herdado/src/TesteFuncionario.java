public class TesteFuncionario {
  public static void main(String[] args) {

    Gerente nico = new Gerente();

    Cliente cliente = new Cliente();


    nico.setNome("Nico");
    nico.setCpf("5165959");
    nico.setSalario(5000);

    System.out.println(nico.getNome());
    System.out.println(nico.getBonificacao());
    System.out.println(nico.getSalario());

  }
}
