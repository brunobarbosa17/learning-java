package main;

import main.dao.ProdutoDAO;
import main.model.Produto;

import java.sql.*;
import java.util.List;

public class TestaInsercaoListagemProduto {
  public static void main(String[] args) {

    Produto comoda = new Produto("Cômoda", "Mesinha pequena");

    try(Connection connection = new ConnectionFactory().getConnection()) {
      ProdutoDAO produtoDAO = new ProdutoDAO(connection);
      produtoDAO.salvar(comoda);
      List<Produto> listaProdutos = produtoDAO.listar();
      listaProdutos.stream().forEach(lp -> {
        System.out.println(lp);
      });
    }
      catch (SQLException e) {
      e.printStackTrace();
    }

    System.out.println(comoda);

  }
}
