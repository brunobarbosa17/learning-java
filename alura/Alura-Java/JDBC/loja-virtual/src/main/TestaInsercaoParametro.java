package main;

import java.sql.*;

public class TestaInsercaoParametro {
  public static void main(String[] args) throws SQLException {

    String nome = "Mouses'";
    String descricao = "Mouse not fio";
    ConnectionFactory factory = new ConnectionFactory();
    try (Connection connection = factory.getConnection()) {


      connection.setAutoCommit(false);

      try (PreparedStatement query = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES ( ?, ?)",
              Statement.RETURN_GENERATED_KEYS)) {

        addVariavel("Smartv", "tv 4k", query);
        addVariavel("Radinho", "radin blutufi", query);

        connection.commit();
        connection.close();

      } catch (Exception ex) {

        ex.printStackTrace();
        System.out.println("ROLLBACKIS");
        connection.rollback();
      }
    }
  }

  private static void addVariavel(String nome, String descricao, PreparedStatement query) throws SQLException {
    query.setString(1, nome);
    query.setString(2, descricao);

    //if (nome.equals("Radinho")) throw new RuntimeException("No cannot add product caraleo!");

    query.execute();

    try (ResultSet rst = query.getGeneratedKeys()) {
      while (rst.next()) {
        Integer id = rst.getInt(1);
        System.out.println("id criado:" + id);
      }

    }


  }
}
