import java.util.Scanner;

public class TesteArray {
    public static void main(String[] args) {
        /*int vetor[]; //int[] vetor;

        vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        for(int numero : vetor) {
            System.out.println(numero);
        }*/

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String palavraInversa = new StringBuilder(palavra).reverse().toString();
        System.out.println((palavra.equals(palavraInversa)) ? "E palindromo!" : "Nao e palindromo!");

    }
}
