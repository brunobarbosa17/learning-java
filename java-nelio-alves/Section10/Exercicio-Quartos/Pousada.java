package io.github.jiangdequan;
import java.util.Scanner;


public class Pousada {
  public static class Quartos {
    private String nomeEstudante;
    private String emailEstudante;
    private int idQuarto;

    public void Quartos(String nomeEstudante, String emailEstudante, int idQuarto) {
      setEmailEstudante(emailEstudante);
      setIdQuarto(idQuarto);
      setNomeEstudante(nomeEstudante);
    }

    public String getNomeEstudante() {
      return this.nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
      this.nomeEstudante = nomeEstudante;
    }

    public String getEmailEstudante() {
      return this.emailEstudante;
    }

    public void setEmailEstudante(String emailEstudante) {
      this.emailEstudante = emailEstudante;
    }

    public int getIdQuarto() {
      return this.idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
      this.idQuarto = idQuarto;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
  }
}