package variaveis;

import java.util.Iterator;

public class Repeticao {
	public static void main(String[] args) {
		int count = 0;
		
		/*while(count <= 10) {
			System.out.println(count++);
		}
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}*/
		
		for (int i = 0; i <= 10; i++) {
			for (int u = 0; u <= 10; u++) {
				System.out.print(u+ " ");
			}
			System.out.println("");
			
		}
		
	}
}
