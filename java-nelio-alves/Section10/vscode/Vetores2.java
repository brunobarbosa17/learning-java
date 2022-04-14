import java.util.Scanner;

public class Vetores2 {

  public static class Product {
    private String nome;
    private double preco;

    public Product(String nome, double preco) {
      this.nome = nome;
      this.preco = preco;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public double getPreco() {
      return preco;
    }

    public void setPreco(double preco) {
      this.preco = preco;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Product[] vetor = new Product[n];

    for (int i = 0; i < n; i++) {
      sc.nextLine();
      String nome = sc.nextLine();
      double preco = sc.nextDouble();
      vetor[i] = new Product(nome, preco);
    }

    double soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      soma += vetor[i].getPreco();
    }
    double media = soma/n;

    System.out.printf("Preço médio = %.2f\n", media);


    sc.close();
  }
}