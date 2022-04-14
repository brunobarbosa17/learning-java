import java.util.Scanner;
import java.util.Locale;

public class Uri1048 {
  public static void main(String[] args) {
    final var localeAmericano = new Locale("en", "US");
    Locale.setDefault(localeAmericano);
    Scanner sc = new Scanner(System.in);

    float salario = sc.nextFloat();
    float bonus;

    if (salario <= 400) {
        bonus = (15 * salario) / 100;
        System.out.printf("Novo salario: %.2f\n", salario+bonus);
        System.out.printf("Reajuste ganho: %.2f\n", bonus);
        System.out.println("Em percentual: 15 %\n");
    }

    if (salario > 400 && salario <= 800) {
        bonus = (12 * salario) / 100;
        System.out.printf("Novo salario: %.2f\n", salario+bonus);
        System.out.printf("Reajuste ganho: %.2f\n", bonus);
        System.out.println("Em percentual: 12 %\n");
    }

    if (salario >= 800.01 && salario <= 1200) {
        bonus = (10 * salario) / 100;
        System.out.printf("Novo salario: %.2f\n", salario+bonus);
        System.out.printf("Reajuste ganho: %.2f\n", bonus);
        System.out.println("Em percentual: 10 %\n");
    }
    if (salario >= 1200.01 && salario <= 2000) {
        bonus = (7 * salario) / 100;
        System.out.printf("Novo salario: %.2f\n", salario+bonus);
        System.out.printf("Reajuste ganho: %.2f\n", bonus);
        System.out.println("Em percentual: 7 %\n");
    }
    if (salario > 2000) {
        bonus = (4 * salario) / 100;
        System.out.printf("Novo salario: %.2f\n", salario+bonus);
        System.out.printf("Reajuste ganho: %.2f\n", bonus);
        System.out.println("Em percentual: 4 %\n");
    }

  }
}


