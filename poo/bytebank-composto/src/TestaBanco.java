public class TestaBanco {
  public static void main(String[] args) {
    Cliente paulo = new Cliente();
    paulo.nome = "Paulo Santos";
    paulo.cpf = "123.456.789-11";
    paulo.profissao = "dev";

    Conta contaPaulo = new Conta();
    contaPaulo.deposita(100);

    contaPaulo.titular = paulo;
    System.out.println(contaPaulo.titular.nome);
    System.out.println(contaPaulo.titular);

  }
}
