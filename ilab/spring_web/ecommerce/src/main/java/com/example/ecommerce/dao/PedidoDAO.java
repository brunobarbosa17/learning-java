package com.example.ecommerce.dao;

import com.example.ecommerce.dto.Faturamento;
import com.example.ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {

  @Query( "SELECT new " +
          " com.example.ecommerce.dto.Faturamento( month(pedido.data) , sum(pedido.valorTotal) )" +
          " FROM " +
          " Pedido as pedido " +
          " WHERE year(pedido.data) = :ano " +
          " GROUP BY month(pedido.data) ")
  public List<Faturamento> recuperarFaturamentoPorAno(@Param("ano") int ano);
}
