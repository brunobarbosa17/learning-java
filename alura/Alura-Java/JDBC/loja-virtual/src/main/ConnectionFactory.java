package main;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

  private final String jdbcUrl = "jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC";
  private final String jdbcUser = "root";
  private final String jdbcPass = "mysql123";

  public DataSource dataSource;

  public ConnectionFactory() {
    ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
    comboPooledDataSource.setJdbcUrl(jdbcUrl);
    comboPooledDataSource.setUser(jdbcUser);
    comboPooledDataSource.setPassword(jdbcPass);

    //comboPooledDataSource.setMaxPoolSize(15);

    this.dataSource = comboPooledDataSource;
  }

  public Connection getConnection() throws SQLException {
    return dataSource.getConnection(jdbcUser, jdbcPass);
  }
}
