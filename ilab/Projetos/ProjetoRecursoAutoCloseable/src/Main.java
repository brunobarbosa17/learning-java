import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor;

        try (MeuRecurso recurso = new MeuRecurso()) {
            do {
                System.out.println("Digite um número: ");
                valor = sc.nextInt();
                System.out.println("Valor a ser usado = " + valor);
                recurso.setValor(valor);


            } while (valor != -1);
        } catch (Exception ex) {
            System.out.println("Erro ao atribuir = " + ex.getMessage());
        }



        sc.close();
    }
}
