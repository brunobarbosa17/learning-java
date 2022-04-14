public class FluxoComError {

  public static void main(String[] args) {
    System.out.println("Ini do main");
    try {
      metodo1();
    } catch (NullPointerException | ArithmeticException | MinhaExcecao ex) {
      System.out.println("exception do try : " + ex.getMessage());
      ex.printStackTrace();
      throw new MinhaExcecao("F");
    }
    System.out.println("Fim do main");
  }

  private static void metodo1() throws MinhaExcecao {
    System.out.println("Ini do metodo1");
    metodo2();
    System.out.println("Fim do metodo1");
  }

  private static void metodo2() {
    System.out.println("ini metodo 2");
    metodo2();
    System.out.println("fim metodo 2");
  }
}