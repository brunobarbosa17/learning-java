package br.com.gomoscorp.lojavirtual.userinterface;

import br.com.gomoscorp.lojavirtual.core.*;

public class Loja {
  public static void main(String[] args) {
    Produto lista[];

    lista = new Produto[6];

    lista[0] = new Produto(1, "Computador", 1000);
    lista[1] = new Produto(2, "Mouse", 50);
    lista[2] = new Produto(3, "Teclado", 100);
    lista[3] = new Produto(4, "Cadeira",1000);
    lista[4] = new Produto(5, "Headset",1000);
    lista[5] = new Produto(6, "TV",1000);


    Cliente cliente[] = new Cliente[5];
    cliente[0] = new Cliente(123, "Bruno", "bruno@teste.com");
    cliente[1] = new Cliente(124, "Lucas", "lucas@teste.com");
    cliente[2] = new Cliente(345, "Fernando", "fernando@teste.com");
    cliente[3] = new Cliente(567, "Alberto", "alberto@teste.com");
    cliente[4] = new Cliente(534, "Luis", "luis@teste.com");

    Pedido p1 = new Pedido();
    p1.setData("11/02/2022");
    p1.setProduto(lista[1]);
    p1.setCliente(cliente[1]);
    System.out.println(p1.exibir());

  }
}
