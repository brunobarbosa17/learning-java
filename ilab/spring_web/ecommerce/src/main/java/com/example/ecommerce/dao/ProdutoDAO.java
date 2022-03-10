package com.example.ecommerce.dao;

import com.example.ecommerce.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

}
