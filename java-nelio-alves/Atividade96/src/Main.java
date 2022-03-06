import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite quantos funcionários deseja registrar!");
    int quantidadeFuncionarios = Integer.parseInt(sc.nextLine());
    List<Funcionario> listaFuncionarios = new ArrayList<>(quantidadeFuncionarios);

    for (int i = 0; i < quantidadeFuncionarios; i++) {
      System.out.println("Digite o id do funcionário #" + i);
      int idFuncionario = Integer.parseInt(sc.nextLine());
      System.out.println("Digite o nome do funcionário #" + i);
      String nome = sc.nextLine();
      System.out.println("Digite o salário do funcionário #" + i);
      double salario = Double.parseDouble(sc.nextLine());
      listaFuncionarios.add(new Funcionario(idFuncionario, nome, salario));
    }

    System.out.println("Digite o ID do funcionário que deseja aumentar o salário: ");
    int idAIncrementar = Integer.parseInt(sc.nextLine());
    System.out.println("Digite a porcentagem do valor que gostaria de incrementar:");
    double porcentagem = Double.parseDouble(sc.nextLine());

    for (int i = 0; i < listaFuncionarios.size(); i++) {
      if(listaFuncionarios.get(i).getId() == idAIncrementar) {
        listaFuncionarios.get(i).aumento(porcentagem);
      }
    }

    System.out.println("---------------------------------------------");
    for (Funcionario elemento: listaFuncionarios) {
      System.out.println("|     ID = " + elemento.getId() + "   |" +
              "|    Nome = " + elemento.getNome() +
              "|     Salário = R$" + elemento.getSalario() + "             |");

    }
    System.out.println("---------------------------------------------");



    sc.close();
  }
}
