package com.example.ecommerce.services;

import com.example.ecommerce.dto.ClienteDTO;

import java.util.List;

public interface IClienteService {
  public List<ClienteDTO> recuperarTodos();
  public ClienteDTO recuperarPeloId(Integer id);
}
