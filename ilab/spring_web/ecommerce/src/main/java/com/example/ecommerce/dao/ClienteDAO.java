package com.example.ecommerce.dao;

import com.example.ecommerce.dto.ClienteDTO;
import com.example.ecommerce.model.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
  @Query("    SELECT "
          + "new com.example.ecommerce.dto.ClienteDTO("
          + "  cliente.numero,"
          + "  cliente.nome,"
          + "  cliente.cpf,"
          + "  cliente.email,"
          + "  cliente.telefone) "
          + "FROM Cliente as cliente")
  public List<ClienteDTO> recuperarTodos();

  @Query(" SELECT "
          + " new br.com.isidrocorp.ecommerce.dto.ClienteDTO("
          + "  cliente.numero,"
          + "  cliente.nome,"
          + "  cliente.cpf,"
          + "  cliente.email,"
          + "  cliente.telefone)"
          + "FROM Cliente as cliente WHERE cliente.numero = :numero")
  public ClienteDTO recuperarPeloId(@Param("numero") Integer numero);
}
