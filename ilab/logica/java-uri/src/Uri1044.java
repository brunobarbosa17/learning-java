import java.util.Scanner;
import java.util.Locale;

public class Uri1044 {
	public static void main(String[] args) {
    final var localeAmericano = new Locale("en", "US");
		Locale.setDefault(localeAmericano);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
    String resultado;

    if (a > b) {
      resultado = (a % b == 0) ? "Sao Multiplos" : "Nao sao Multiplos";
    } else {
      resultado = (b % a == 0) ? "Sao Multiplos" : "Nao sao Multiplos";
    }
    
    System.out.println(resultado);
		
	}
}



