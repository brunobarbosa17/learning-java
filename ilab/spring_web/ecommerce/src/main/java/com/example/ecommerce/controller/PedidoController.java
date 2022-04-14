package com.example.ecommerce.controller;

import com.example.ecommerce.dao.PedidoDAO;
import com.example.ecommerce.dto.Faturamento;
import com.example.ecommerce.model.Pedido;
import com.example.ecommerce.services.IPedidoService;
import com.example.ecommerce.util.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PedidoController {

  @Autowired
  @Qualifier("dia-a-dia")
  private IPedidoService service;

  @PostMapping("/pedidos")
  public ResponseEntity<?> inserirNovo(@RequestBody Pedido novo){
    Pedido resultado = service.adicionarPedido(novo);
    if (resultado != null) { // inseriu, ufa!
      return ResponseEntity.status(201).body(resultado);
    }
    return ResponseEntity.status(400).body(new Mensagem(9876, "Dados invalidos para a estrutura pedido"));
  }

  @DeleteMapping("/pedidos/{id}")
  public ResponseEntity<?> removerPedido(@PathVariable Integer id){
    if (service.removerPedido(id)) {
      return ResponseEntity.ok(new Mensagem(1000,"Pedido removido com sucesso"));
    }
    return ResponseEntity.badRequest().body(new Mensagem(9845,"Erro ao remover pedido"));
  }


  // mais um endpoint para remover o Pedido
  // queremos verificar se vai remover só o item ou tb o produto


//	@Autowired
//	private PedidoDAO dao;
//
//	@GetMapping("/pedidos")
//	public List<Pedido> recuperarTodos(){
//		return (List<Pedido>)dao.findAll();
//	}
//
//	@GetMapping("/faturamento/{ano}")
//	public List<Faturamento> recuperarFaturamento(@PathVariable int ano){
//		return dao.recuperarFaturamentoPorAno(ano);
//	}

}
