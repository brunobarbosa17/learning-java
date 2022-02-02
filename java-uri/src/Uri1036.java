import java.util.Scanner;
import java.util.Locale;

public class Uri1036 {
	public static void main(String[] args) {
    final var localeAmericano = new Locale("en", "US");
		Locale.setDefault(localeAmericano);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

    double x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    double x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    
    System.out.printf("R1 = %.5f\nR2 = %.5f", x1, x2);
	}
}




