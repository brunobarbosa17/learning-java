import java.util.Scanner;

public class Uri1159 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X, somatorio = 0, aux = 0, i = 0;

    do {
      X = sc.nextInt();
      if (X == 0 ) { break; }
      i = X;
      while (aux != 5) {
        if (i % 2 == 0) {
          somatorio += i;
          aux++;
        }
        i++;
      }

      System.out.println(somatorio);
      somatorio = 0;
      aux = 0;
    } while (X != 0);
    

    sc.close();
  }
  
}