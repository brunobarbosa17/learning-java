import java.util.Scanner;
import java.util.Locale;

public class Uri1046 {
  public static void main(String[] args) {
    final var localeAmericano = new Locale("en", "US");
    Locale.setDefault(localeAmericano);
    Scanner sc = new Scanner(System.in);

    int inicio = sc.nextInt();
    int fim = sc.nextInt();

    if (inicio > fim) {
      System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (inicio - fim));
    } else if (fim > inicio) {
      System.out.printf("O JOGO DUROU %d HORA(S)\n", fim - inicio);
    } else {
      System.out.printf("O JOGO DUROU 24 HORA(S)\n");
    }

  }
}
