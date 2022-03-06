import java.util.Scanner;
import java.util.Locale;

public class Uri1017 {
	public static void main(String[] args) {
    final var localeAmericano = new Locale("en", "US");
		Locale.setDefault(localeAmericano);
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();

    System.out.printf("%.3f\n", x1 * x2 / 12);

	}
}
