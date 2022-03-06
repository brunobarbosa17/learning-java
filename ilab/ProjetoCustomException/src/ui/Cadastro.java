package ui;

import model.Produto;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();
        System.out.println("Digite o código do produto: ");
        String texto = sc.nextLine();
        p.setId(Integer.parseInt(texto));

        System.out.println("Digite a descricao do produto: ");
        texto = sc.nextLine();
        p.setDescricao(texto);

        System.out.println("Digite o preco do produto: ");
        texto = sc.nextLine();
        p.setPreco(Double.parseDouble(texto));

        System.out.println("Produto cadastrado!");
    }
}
