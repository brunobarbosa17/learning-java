package main;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Cadastro {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome;
    int tipo, numFunc;
    double valor1,valor2, valor3;
    int valor4;
    String linhaDoArquivo;
    int opcao;

    try {
      File arquivo = new File("teste.txt");
      FileWriter escritor = new FileWriter(arquivo, true);

      do {
        System.out.println("digite 1 - Chefe / 2 - Comissionado / 3 - Horista /4 - Empreiteiro ");
        tipo = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a funcional: ");
        numFunc = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o nome : ");
        nome = sc.nextLine();

        if(tipo == 1) {
          System.out.println("Digite o salário base: ");
          valor1 = Double.parseDouble(sc.nextLine());
          System.out.println("Digite o adicional função: ");
          valor2 = Double.parseDouble(sc.nextLine());
          System.out.println("digite o beneficio Terno: ");
          valor3 = Double.parseDouble(sc.nextLine());
          linhaDoArquivo = tipo + ";" + numFunc +
                  ";" + nome + ";" + valor1 + ";" + valor2 +

                  ";" + valor3;
        } else if (tipo == 2) {
            valor1 = Double.parseDouble(sc.nextLine());
            System.out.println("Digite o adicional função: ");
            valor2 = Double.parseDouble(sc.nextLine());
            System.out.println("digite o beneficio Terno: ");
            valor3 = Double.parseDouble(sc.nextLine());
            linhaDoArquivo = tipo + ";" + numFunc +
                    ";" + nome + ";" + valor1 + ";" + valor2 +

                    ";" + valor3;
        } else if (tipo == 3) {
            valor1 = Double.parseDouble(sc.nextLine());
            System.out.println("Digite o adicional função: ");
            valor2 = Double.parseDouble(sc.nextLine());
            System.out.println("digite o beneficio Terno: ");
            valor3 = Double.parseDouble(sc.nextLine());
            linhaDoArquivo = tipo + ";" + numFunc +
                    ";" + nome + ";" + valor1 + ";" + valor2 +

                    ";" + valor3;
        } else if (tipo ==4) {
            valor1 = Double.parseDouble(sc.nextLine());
            System.out.println("Digite o adicional função: ");
            valor2 = Double.parseDouble(sc.nextLine());
            System.out.println("digite o beneficio Terno: ");
            valor3 = Double.parseDouble(sc.nextLine());
            linhaDoArquivo = tipo + ";" + numFunc +
                    ";" + nome + ";" + valor1 + ";" + valor2 +

                    ";" + valor3;
        } else {

        }

      } while (opcao != 0);

    } catch (Exception ex) {
      System.err.println("ERro ao manipular");
      ex.printStackTrace();
    }
  }


}
