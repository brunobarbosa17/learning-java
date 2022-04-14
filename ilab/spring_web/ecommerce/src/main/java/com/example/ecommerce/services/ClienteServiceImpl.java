package com.example.ecommerce.services;

import com.example.ecommerce.dao.ClienteDAO;
import com.example.ecommerce.dto.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServiceImpl implements IClienteService {

  @Autowired
  private ClienteDAO dao;

  @Override
  public List<ClienteDTO> recuperarTodos() {
    // TODO Auto-generated method stub
    return dao.recuperarTodos();
  }

  @Override
  public ClienteDTO recuperarPeloId(Integer id) {
    // TODO Auto-generated method stub
    return dao.recuperarPeloId(id);
  }
}
