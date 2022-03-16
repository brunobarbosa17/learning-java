package com.example.ecommerce.services;

import com.example.ecommerce.dao.ClienteDAO;
import com.example.ecommerce.dto.ClienteDTO;
import com.example.ecommerce.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ClienteServiceImplAlternativa implements  IClienteService {

  @Autowired
  private ClienteDAO dao;

  @Override
  public List<ClienteDTO> recuperarTodos() {
    System.out.println("estou no recuperar todos alternativo");
    List<ClienteDTO> lista = new ArrayList<ClienteDTO>();
    for (Cliente c: dao.findAll()) {
      lista.add(new ClienteDTO(c));  // uso a estratégia do construtor
    }
    return lista;
  }

  @Override
  public ClienteDTO recuperarPeloId(Integer id) {
    System.out.println("Estou no recuperar pelo id alternativo");
    // TODO Auto-generated method stub
    Cliente res = dao.findById(id).orElse(null);
    if (res != null) {
      return ClienteDTO.fromCliente(res);  // aqui uso o "builder" estático
    }
    return null;
  }
}
