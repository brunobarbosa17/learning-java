import java.util.Scanner;
import java.util.Locale;

public class Uri1005 {
	public static void main(String[] args) {
		final var localeAmericano = new Locale("en", "US");
		Locale.setDefault(localeAmericano);
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double c = ( (a * 3.5) + (b * 7.5) ) / 11;
		
		System.out.printf("MEDIA = %.5f\n", c);
	}
}
