import java.util.Scanner;

public class SistemaBiblioteca {
	public static void main(String[] args) {
		Livro livro1, livro2, livro3, livro4, livro5, livro6;
		Scanner sc = new Scanner(System.in);
		
		livro1 = new Livro("Gabriela", "Jorge Amado", 1999, "Romance", 2);
		livro2 = new Livro("Peppa", "Augusto", 1999, "Infantil", 3);
		livro3 = new Livro("Power Rangers", "Augusto", 1999, "Infantil", 4);
		livro4 = new Livro("Bob Sponja", "Augusto", 1999, "Infantil", 5);
		livro5 = new Livro("Cavaleiros do Zodíaco", "Augusto", 1999, "Infantil", 6);
		livro6 = new Livro("Zé colmeia", "Augusto", 1999, "Infantil", 1);
		
		livro1.emprestimo();
		livro1.imprimir();
		

		
		
		sc.close();
	}

}
