package main;

import main.modelo.Produto;

import java.sql.*;

public class PersistenciaProduto {

  private Connection connection;

  public PersistenciaProduto(Connection connection) {
    this.connection = connection;
  }

  public void salvarProduto(Produto produto) throws SQLException {

    String sql = "INSERT INTO produto (nome, descricao) VALUES (?,?)";

    try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
      pstm.setString(1, produto.getNome());
      pstm.setString(2, produto.getDescricao());
      pstm.execute();

      try(ResultSet rst = pstm.getGeneratedKeys()) {
        while (rst.next()) {
          produto.setId(rst.getInt(1));
        }
      }
    }
  }
}
