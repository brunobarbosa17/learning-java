package main;

import main.dao.CategoriaDAO;
import main.dao.ProdutoDAO;
import main.model.Categoria;
import main.model.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemCategorias {

  public static void main(String[] args) throws SQLException {

    try(Connection connection = new ConnectionFactory().getConnection()) {
      CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
      List<Categoria> listaDeCategorias = categoriaDAO.listarComProdutos();
      listaDeCategorias.stream().forEach(ct -> {
        System.out.println(ct.getNome());
        for (Produto produto : ct.getProdutos()) {
          System.out.println(ct.getNome() + "-" + produto.getNome());
        }

      });


    }
  }
}
