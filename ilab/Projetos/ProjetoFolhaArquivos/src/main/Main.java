package main;

import core.Funcionario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
  public static void main(String[] args) {
    try {
      FileReader leitor = new FileReader(new File("src/folha.txt"));
      BufferedReader br = new BufferedReader(leitor);

      br.readLine();
      String dadosFuncionario = "";

      do {
        dadosFuncionario = br.readLine();

        try {
          Funcionario funcionario =

        } catch (Exception ex) {
          System.out.println(ex);
        }

      } while (dadosFuncionario != null);
    } catch (Exception ex) {
      System.out.println(ex);
    }
  }
}
