package variaveis;

public class Condicional {
	public static void main(String[] args) {
		int idade = 22;
		boolean maiorDeIdade = false;
		if (idade >= 18) {
			maiorDeIdade = true;
		}
		
		if (maiorDeIdade) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você é menor de idade!");
		}
	}
}
