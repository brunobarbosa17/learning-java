package com.example.ecommerce.controller;

import com.example.ecommerce.dao.DepartamentoDAO;
import com.example.ecommerce.model.Departamento;
import com.example.ecommerce.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartamentoController {

  @Autowired
  private DepartamentoDAO dao;

  @GetMapping("/departamentos")
  public List<Departamento> recuperarTodos() {
    return (List<Departamento>)dao.findAll();
  }


  @PostMapping("/departamentos")
  public Departamento includeDepartament(@RequestBody Departamento novo) {
    return dao.save(novo);
  }

  @PutMapping("/departamentos")
  public Departamento alterDepartament(@RequestBody Departamento atual) {
    return dao.save(atual);
  }

}
