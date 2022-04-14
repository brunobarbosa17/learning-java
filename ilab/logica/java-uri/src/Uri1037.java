import java.util.Scanner;
import java.util.Locale;

public class Uri1037 {
  public static void main(String args[]) {
    final var localeAmericano = new Locale("en", "US");
    Locale.setDefault(localeAmericano);
    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    if(n < 0 || n > 100){
      System.out.printf("Fora de intervalo\n");
     }else{
      if(n >= 0 && n <= 25){
        System.out.printf("Intervalo [0,25]\n");
      }else if(n > 25 && n <= 50){
        System.out.printf("Intervalo (25,50]\n");
      }else if(n > 50 && n <= 75){
        System.out.printf("Intervalo (50,75]\n");
      }else{
        System.out.printf("Intervalo (75,100]\n");
      }
     }

    sc.close();
  }
}