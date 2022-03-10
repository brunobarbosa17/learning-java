package com.example.exemploconexxao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDAO {

  public List<Departamento> readAll() {

    try {
      PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement("SELECT * FROM departamento");
      ResultSet rs =ps.executeQuery();
      List<Departamento> resultado = new ArrayList<Departamento>();
      if (rs.next()) {
        resultado.add(new Departamento(rs.getInt("id"), rs.getString("nome"), rs.getInt("andar")));
      }
      rs.close();
      return resultado;
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return null;
  }
}
