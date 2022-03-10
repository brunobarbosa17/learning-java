import java.util.Scanner;

public class PercorrendoMatriz {
  public static void main(String[] args) {
    double matriz[][] = new double[12][12];
    Scanner sc = new Scanner(System.in);

    String operacao = sc.next();
    double somatorio = 0;

    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        matriz[i][j] = sc.nextDouble();
      }
    }

    for (int i = 1; i < 12; i++) {
      for (int j = 0; j < i; j++) {
        if (i == j && i != 0 && j != 0) {
          somatorio += matriz[i-1][j-1];
        }
      }
    }

    if (operacao.equals("M")) {
      System.out.printf("%.1f\n", (somatorio / 12));
    } else {
      System.out.printf("%.1f\n", somatorio);
    }



  }
}
