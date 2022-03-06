import java.util.Scanner;

public class MaquinaRefrigerante {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int op, escolha;

    Refrigerante lista[];
    lista = new Refrigerante[3];

    lista[0] = new Refrigerante("Coquinha", 5, 1);
    lista[1] = new Refrigerante("Pepsinha", 3, 1);
    lista[2] = new Refrigerante("Indaivis", 2, 2);

    System.out.println("#####################################");
    System.out.println("  Bem-Vindo a Máquina de Refri!");
    System.out.println("#####################################");
    System.out.println();
    System.out.println("  Digite o seu nome:");
    String nome = sc.nextLine();
    System.out.println("#####################################");
    System.out.println("  Digite a quantidade de créditos: ");
    System.out.println("#####################################");
    int creditos = sc.nextInt();
    Cliente c1 = new Cliente(creditos, nome);

    do {
      System.out.println("Digite 1 para continuar OU 9 PARA ENCERRAR!");
      op = sc.nextInt();
      if (op != 1) {
        break;
      }
      System.out.println("#####################################");
      System.out.println("#     Lista de Refris disponiveis!  #");
      System.out.println("#####################################");
      for (int i = 0; i < lista.length; i++) {
        System.out.println("  ----------------------");
        System.out.printf("| Opção %d:\n", i+1);
        System.out.println("| Nome : " + lista[i].getNome());
        System.out.println("| Preço : " + lista[i].getPreco());
        System.out.println("| Quantidade : " + lista[i].getQuantidade());
        System.out.println("  ----------------------");
        System.out.println();
      }

      do {
        System.out.println("Digite qual opção gostaria OU DIGITE 9 PARA ENCERRAR ");
        escolha = sc.nextInt();
      } while (escolha < 1 || escolha > 3);

      if(c1.efetuarCompra(lista[escolha-1].getPreco()) && lista[escolha-1].getQuantidade() > 0) {
        lista[escolha-1].setQuantidade(lista[escolha-1].getQuantidade() - 1);
        System.out.println("  #######");
        System.out.println("| Compra realizada !!!!");
        System.out.println("| Nova quantidade de creditos: " + c1.getCreditos());
        System.out.println("  ########");
      } else {
        System.out.println("  @@@@@@@@@@@@@@");
        System.out.println("| ERRO AO FINALIZAR COMPRA!");
        System.out.println("  @@@@@@@@@@@@@@");
      }


    } while(op != 9);


  }
}
