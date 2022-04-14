package com.example.ecommerce.services;

import com.example.ecommerce.dao.PedidoDAO;
import com.example.ecommerce.model.ItemPedido;
import com.example.ecommerce.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;

@Qualifier("dia-a-dia")
@Component
public class PedidoServiceImpl implements IPedidoService {

  @Autowired
  private PedidoDAO dao;

  @Override
  public Pedido adicionarPedido(Pedido novo) {
    // TODO Auto-generated method stub
    for (ItemPedido item : novo.getItens()) {
      item.setPedido(novo);
    }
    Pedido resultado = dao.save(novo);
    return resultado;
  }

  @Override
  public boolean removerPedido(Integer id) {
    // TODO Auto-generated method stub
    try {
      dao.deleteById(id);
      return true;
    } catch (Exception ex) {
      return false;
    }
  }
}

