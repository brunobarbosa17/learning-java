import java.util.Scanner;
import java.util.Locale;

public class Uri1043 {
  public static void main(String[] args) {
    final var localeAmericano = new Locale("en", "US");
    Locale.setDefault(localeAmericano);
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    double ab = a+b;
    double ac = a+c;
    double bc = b+c;

    if (a < b + c && b < a + c && c < a + b) {
      System.out.printf("Perimetro = %.1f\n", (a+b+c));
    } else {
      double area = ((a + b) * c) / 2;
      System.out.printf("Area = %.1f\n", area);
    }

    sc.close();
  }
}
