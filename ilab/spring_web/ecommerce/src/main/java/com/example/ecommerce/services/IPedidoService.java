package com.example.ecommerce.services;

import com.example.ecommerce.model.Pedido;

public interface IPedidoService {

  public Pedido adicionarPedido(Pedido novo);
  public boolean removerPedido(Integer id);
}
