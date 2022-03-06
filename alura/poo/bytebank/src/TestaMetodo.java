public class TestaMetodo {
  public static void main(String[] args) {
    Conta contaMarcela = new Conta();
    contaMarcela.deposita(200);

    System.out.println(contaMarcela.saldo);

    contaMarcela.saca(20);
    System.out.println(contaMarcela.saldo);

    Conta contaBruno = new Conta();
    contaBruno.saldo = 1000;

    if(contaBruno.transfere(300, contaMarcela)) {
      System.out.println("Transferência feita com sucesso");
    } else {
      System.out.println("Transferência falhou");
    }


  }
}
