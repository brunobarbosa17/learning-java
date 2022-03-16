package com.example.ecommerce.dao;

import com.example.ecommerce.model.Produto;
import com.example.ecommerce.model.Departamento;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

  public List<Produto> findByNomeOrDescricaoContaining(String nome, String descricao);

  public List<Produto> findByDepto(Departamento d);

  @Query("SELECT new " +
          " com.example.ecommerce.model.Produto(produto.codigo," +
          " produto.nome," +
          " produto.descricao," +
          " produto.preco," +
          " produto.qtdEstoque," +
          " produto.linkFoto," +
          " departamento.numero," +
          " departamento.nome," +
          " departamento.andar)" +
          " FROM " +
          "Produto as produto INNER JOIN Departamento as departamento ON " +
          "produto.depto.numero = departamento.numero")
  public List<Produto> recuperarTudo();

}
