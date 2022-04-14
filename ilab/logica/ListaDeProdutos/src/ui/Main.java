package ui;

import core.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        for (int i = 1; i < 15; i++) {
            listaProdutos.add(new Produto(i, "Produto" + i, i * 100, i * 2));
        }

        double valorTotal = 0;
        Produto maisCaro = listaProdutos.get(0), maisBarato = listaProdutos.get(0);
        for (Produto produto: listaProdutos) {
            valorTotal += produto.getPreco();
            if (produto.getPreco() > maisCaro.getPreco()) {
                maisCaro = produto;
            }

            if (produto.getPreco() < maisBarato.getPreco()) {
                maisBarato = produto;
            }

        }

        System.out.println("Valor total do estoque R$" + valorTotal);
        System.out.println("Produto mais caro = " + maisCaro.toString());
        System.out.println("Produto mais barato = " + maisBarato.toString());


    }
}
