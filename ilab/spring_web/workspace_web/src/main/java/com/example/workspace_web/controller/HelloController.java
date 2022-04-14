package com.example.workspace_web.controller;

import com.example.workspace_web.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String sayHello() {
    return "Hello World!";
  }

  @GetMapping("/helloHtml")
  public String sayHelloInHtml() {
    return "<html>" +
            "<head>" +
            "<title> My first page </title>" +
            "</head>" +
            "<body>" +
            "<h1> My first page dynamic </h1>" +
            "<p>Salve!</p>" +
            "</body>";
  }

  @GetMapping("/produto")
  public Produto showProduct() {
    Produto p = new Produto();
    p.setId(1234);
    p.setDescricao("Pc Gamer");
    p.setPreco(5000);
    p.setQuantidadeEstoque(5);
    p.setLinkFoto("pc.jpeg");
    return p;
  }
}
