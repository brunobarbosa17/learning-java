import java.util.Scanner;
import java.util.Locale;

public class Uri1014 {
	public static void main(String[] args) {
		final var localeAmericano = new Locale("en", "US");
		Locale.setDefault(localeAmericano);
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		System.out.printf("%.3f km/l\n", x/y);
	}
}
