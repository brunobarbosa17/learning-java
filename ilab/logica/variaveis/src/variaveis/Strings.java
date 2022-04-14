package variaveis;

public class Strings {
	public static void main(String[] args) {
		
		String frase = "meu nome é bruno lucas";
		String fraseUpper = frase.toUpperCase();
		System.out.println(fraseUpper);
		
		String fraseComEspacos = "   aaa meu nome eee bruno    ";
		String fraseSemEspacos = fraseComEspacos.trim();
		System.out.println(fraseSemEspacos);
		
		String fraseOriginal = "Oi meu nome é Bruno";
		String fraseSubstr = fraseOriginal.substring(7, 11);
		System.out.println(fraseSubstr);
		
		String fraseNormal = "abacaxi, uva, manga, banana abacaxi";
		String fraseReplace = fraseNormal.replace("abacaxi", "limao");
		System.out.println(fraseReplace);
		
		int indexAbacaxi = fraseNormal.indexOf("banana");
		int ultimaAbacaxi = fraseNormal.lastIndexOf("abacaxi");
		
		System.out.println(indexAbacaxi);
		System.out.println(ultimaAbacaxi);
		
		String[] vet = fraseNormal.split(" ");
		System.out.println(vet[1]);
		
	}
}
