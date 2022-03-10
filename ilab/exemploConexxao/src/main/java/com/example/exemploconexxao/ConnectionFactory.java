package com.example.exemploconexxao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

  private static Connection connection;
  private static final String url = "jdbc:mysql://localhost:3306/ecommerce_ifood";
  private static final String username = "root";
  private static final String password = "123";

  static {
    System.out.println("Starting connection");

    try {
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
      connection = DriverManager.getConnection(url, username, password);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static Connection getConnection() {
    return connection;
  }


}
