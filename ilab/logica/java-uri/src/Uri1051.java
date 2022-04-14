import java.util.Scanner;
import java.util.Locale;

public class Uri1051 {
  public static void main(String[] args) {
    final var localeAmericano = new Locale("en", "US");
    Locale.setDefault(localeAmericano);
    Scanner sc = new Scanner(System.in);

    float salario = sc.nextFloat();

    if (salario >= 0.00 && salario <= 2000.00) {
      System.out.println("Isento");
    }
    if (salario >= 2000.01 && salario <= 3000.00) {
      System.out.printf("R$ %.2f\n", (salario - 2000.00) * 0.08);
    }

    if (salario >= 3000.01 && salario <= 4500.00) {
      System.out.printf("R$ %.2f\n", ((salario - 3000.00) * 0.18 + 1000.00 * 0.08));

    }
    if (salario > 4500.00) {
      System.out.printf("R$ %.2f\n", ((salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08));
    }

  }
}
