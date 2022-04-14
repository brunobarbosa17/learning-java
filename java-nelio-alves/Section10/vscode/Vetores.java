import java.util.Scanner;

public class Vetores {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double[] vect = new double[n];
    double soma = 0, media = 0;

    for (int i = 0; i < vect.length; i++) {
      vect[i] = sc.nextDouble();
    }

    for (int i = 0; i < vect.length; i++) {
      soma += vect[i];
    }

    media = soma / n;

    System.out.printf("A media dos valores é: %.2f", media);
    sc.close();
  }
}