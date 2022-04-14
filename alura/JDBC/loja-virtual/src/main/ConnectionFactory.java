package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {

  public Connection getConnection() throws SQLException {
    return DriverManager
            .getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "mysql123");
  }
}
