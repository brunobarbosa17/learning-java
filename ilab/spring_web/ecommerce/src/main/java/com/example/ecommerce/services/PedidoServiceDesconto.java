package com.example.ecommerce.services;

import com.example.ecommerce.dao.PedidoDAO;
import com.example.ecommerce.model.ItemPedido;
import com.example.ecommerce.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("desconto")
public class PedidoServiceDesconto implements IPedidoService {

  @Autowired
  private PedidoDAO dao;

  @Override
  public Pedido adicionarPedido(Pedido novo) {
    // TODO Auto-generated method stub
    System.out.println("Nova logica do pedido para criar com desconto");
    // minha regra de negócio é a seguinte: acima de R$ 1000,00 eu automaticamente aplico 10% de desconto
    for (ItemPedido item: novo.getItens()) {
      item.setPedido(novo);
    }
    if (novo.getValorBruto() >= 1000.00) {
      double desconto = novo.getValorBruto() * 0.1;
      novo.setDesconto(desconto);
      novo.setValorTotal(novo.getValorBruto() - desconto);
    }
    Pedido p = dao.save(novo);
    return p;
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
