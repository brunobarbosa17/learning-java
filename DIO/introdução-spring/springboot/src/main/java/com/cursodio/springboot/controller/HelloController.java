package com.cursodio.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String helloMessage() {
    return "Hello, studying in DIO!";
  }
}
