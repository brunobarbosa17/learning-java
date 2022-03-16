package com.example.ecommerce.controller;

import java.util.List;

import com.example.ecommerce.model.Departamento;
import com.example.ecommerce.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ecommerce.dao.ProdutoDAO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

  @Autowired
  private ProdutoDAO dao;

  /*@GetMapping("/produtos")
  public List<Produto> recuperarTodos() {
    List<Produto> lista = (List<Produto>)dao.findAll();
    return lista;
  }*/

  @GetMapping("/produtos")
  public List<Produto> getAll() {
    return (List<Produto>)dao.recuperarTudo();
  }

  @GetMapping("/produtos/{id}")
  public ResponseEntity<Produto> getProductById(@PathVariable Integer id) {
    Produto res = dao.findById(id).orElse(null);
    if(res != null) {
      return ResponseEntity.ok(res);
    }

    return ResponseEntity.status(404).build();
  }


  @GetMapping("/produtos/busca")
  public ResponseEntity<List<Produto>> getByWord(@RequestParam(name = "chave") String chave) {
    List<Produto> res = dao.findByNomeOrDescricaoContaining(chave, chave);
    if(res.size() != 0) {
      return ResponseEntity.ok(res);
    }

    return ResponseEntity.noContent().build();
  }

  @GetMapping("/produtos/departamento/{id}")
  public List<Produto> getProdutosByDepartament(@PathVariable Integer id) {
    Departamento d = new Departamento();
    d.setNumero(id);
    return dao.findByDepto(d);
  }

}
