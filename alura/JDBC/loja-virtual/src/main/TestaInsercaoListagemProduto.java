package main;

import main.dao.ProdutoDAO;
import main.model.Produto;

import java.sql.*;

public class TestaInsercaoProduto {
  public static void main(String[] args) {

    Produto comoda = new Produto("Cômoda", "Mesinha pequena");

    try(Connection connection = new ConnectionFactory().getConnection()) {
      ProdutoDAO produtoDAO = new ProdutoDAO(connection);
      produtoDAO.salvar(comoda);
      //persistenciaProduto.listar();
    }
      catch (SQLException e) {
      e.printStackTrace();
    }

    System.out.println(comoda);

  }
}
