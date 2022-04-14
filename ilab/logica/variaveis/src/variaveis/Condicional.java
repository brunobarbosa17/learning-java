package variaveis;

public class Condicional {
	public static void main(String[] args) {
		int idade = 22;
		
		/*if (idade >= 18) {
			maiorDeIdade = true;
		}*/
		
		boolean maiorDeIdade = idade >= 18;
		
		if (maiorDeIdade) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você é menor de idade!");
		}
	}
}
