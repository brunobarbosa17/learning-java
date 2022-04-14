import java.util.Scanner;

public class Uri1174 {
  public static void main(String[] args) {
    double[] a = new double[100];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 100; i++) {
      a[i] = sc.nextDouble();
    }
    for (int i = 0; i < 100; i++) {
      if (a[i] <= 10) {
        System.out.printf("A[%d] = %.1lf\n", i, a[i]);
      }
    }

    sc.close();
  }
  
}
