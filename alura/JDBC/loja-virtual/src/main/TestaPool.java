package main;

import java.sql.SQLException;

public class TestaPool {
  public static void main(String[] args) throws SQLException {

    ConnectionFactory connection = new ConnectionFactory();

    for (int i = 0; i < 20; i++) {
      connection.getConnection();
      System.out.println("conexao numero #" + i);
    }
  }
}
