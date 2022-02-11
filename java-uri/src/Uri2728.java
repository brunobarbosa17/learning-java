import java.util.Scanner;

public class Uri2728 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int D = sc.nextInt();
    int cesta = 0;

    if (D <= 800) {
      cesta = 1;
    } else if (D <= 1400) {
      cesta = 2;
    } else if (D <= 2000) {
      cesta = 3;
    }

    System.out.println(cesta);


    sc.close();
  }
  
}