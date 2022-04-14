import java.util.Scanner;
import java.util.Locale;


public class Uri1012 {
  public static void main(String args[]) {
    final var localeAmericano = new Locale("en", "US");
        Locale.setDefault(localeAmericano);
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    double triangulo = (a * c) / 2;
    double circulo = 3.14159 * (c * c);
    double trapezio = (a + b) * (c / 2);
    double quadrado = b * b;
    double retangulo = a * b;

    System.out.printf("TRIANGULO: %.3f\n", triangulo);
    System.out.printf("CIRCULO: %.3f\n", circulo);
    System.out.printf("TRAPEZIO: %.3f\n", trapezio);
    System.out.printf("QUADRADO: %.3f\n", quadrado);
    System.out.printf("RETANGULO: %.3f\n", retangulo);

    sc.close();
  }
}