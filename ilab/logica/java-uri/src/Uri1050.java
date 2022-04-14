import java.util.Scanner;
import java.util.Locale;

public class Uri1050 {
  public static void main(String[] args) {
    final var localeAmericano = new Locale("en", "US");
    Locale.setDefault(localeAmericano);
    Scanner sc = new Scanner(System.in);

    int ddd = sc.nextInt();

    if(ddd == 61) {
      System.out.println("Brasilia");
    } else if (ddd == 71) {
      System.out.println("Salvador");
    }else if (ddd == 11) {
      System.out.println("Sao Paulo");
    }else if (ddd == 21) {
      System.out.println("Rio de Janeiro");
    }else if (ddd == 32) {
      System.out.println("uiz de Fora");
    }else if (ddd == 19) {
      System.out.println("Campinas");
    }else if (ddd == 27) {
      System.out.println("Vitoria");
    }else if (ddd == 31) {
      System.out.println("Belo Horizonte");
    }else {
      System.out.println("DDD nao cadastrado");
    }

  }
}
