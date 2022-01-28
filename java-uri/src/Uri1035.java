import java.util.Scanner;

public class Uri1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int somaAB = a + b;
		int somaCD = c + d;
		
		boolean positivoCD = (c > 0 && d > 0) ? true : false;
		
		boolean parA = (a % 2 == 0) ? true : false;
		
		if (b > c && d > a && somaCD > somaAB && positivoCD && parA) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
		
	}
}
