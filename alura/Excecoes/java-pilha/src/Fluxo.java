public class Fluxo {

  public static void main(String[] args) {
    System.out.println("Ini do main");
    try {
      metodo1();
    } catch (NullPointerException | ArithmeticException ex) {
      System.out.println("exception do try : " + ex.getMessage());
      ex.printStackTrace();
    }
    System.out.println("Fim do main");
  }

  private static void metodo1() {
    System.out.println("Ini do metodo1");
    metodo2();
    System.out.println("Fim do metodo1");
  }

  private static void metodo2() {
    System.out.println("Ini do metodo2");
    Conta c = new Conta();
    throw new ArithmeticException("F");

    //System.out.println("Fim do metodo2");
  }
}