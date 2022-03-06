package ui;

import entities.Departamento;
import entities.Funcionario;
import entities.HoraContrato;
import entities.enums.NivelFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Digite o nome do departamento: ");
    String nomeDepartamento = sc.nextLine();
    System.out.println("Digite as informações do funcionário:");
    System.out.print("Nome: ");
    String nomeFuncionario = sc.nextLine();
    System.out.print("Senioridade: ");
    String senioridade = sc.nextLine();
    System.out.print("Salário base: ");
    double salarioBase = Double.parseDouble(sc.nextLine());

    Funcionario funcionario = new Funcionario(nomeFuncionario,
            NivelFuncionario.valueOf(senioridade),
            salarioBase,
            new Departamento(nomeDepartamento));

    System.out.print("Quantos contratos o funcionário terá? ");
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= n; i++) {
      System.out.println("Digite as informações do contrato #" + i);
      System.out.print("Data (DD/MM/YYY) : ");
      Date contratoDate = sdf.parse(sc.nextLine());
      System.out.print("Digite o valor por hora: R$");
      double valorPorHora = Double.parseDouble(sc.nextLine());
      System.out.print("Duração em horas: ");
      int horas = Integer.parseInt(sc.nextLine());

      HoraContrato contrato = new HoraContrato(contratoDate, valorPorHora, horas);
      funcionario.adicionarContrato(contrato);
    }

    System.out.println();
    System.out.print("Digite o mês e o ano para calcular o salário (MM/YYYY): ");
    String mesEAno = sc.nextLine();
    int mes = Integer.parseInt(mesEAno.substring(0, 2));
    int ano = Integer.parseInt(mesEAno.substring(3));
    System.out.println("Nome: " + funcionario.getNome());
    System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
    System.out.println("Salário de " + mesEAno + ": " + String.format("%.2f", funcionario.calcularRenda(ano, mes)));



    sc.close();
  }
}
