package com.example.ecommerce.controller;

import java.util.List;

import com.example.ecommerce.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ecommerce.dao.ProdutoDAO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

  @Autowired
  private ProdutoDAO dao;

  @GetMapping("/produtos")
  public List<Produto> recuperarTodos() {
    List<Produto> lista = (List<Produto>)dao.findAll();
    return lista;
  }

  @GetMapping("/teste")
  public String teste() {
    System.out.println("oi");
    return "teste";
  }

  @GetMapping("/produto1")
  public Produto recuperarProduto() {
    return dao.findById(1).get();
  }
}
