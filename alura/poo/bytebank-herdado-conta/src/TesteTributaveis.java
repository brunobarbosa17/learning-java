public class TesteTributaveis {
  public static void main(String[] args) {

    ContaCorrente cc = new ContaCorrente(222, 333);
    cc.deposita(100);

    SeguroDeVida seguro = new SeguroDeVida();

    CalculadorDeImpostp calc = new CalculadorDeImpostp();
    calc.registra(cc);
    calc.registra(seguro);

    System.out.println(calc.getTotalImposto());


  }
}
