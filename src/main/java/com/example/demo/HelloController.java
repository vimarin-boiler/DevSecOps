package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "Hola desde Spring Boot para DevSecOps!";
  }

  @GetMapping("/suma")
  public int suma(@RequestParam(name = "a", required = true) int a,
                  @RequestParam(name = "b", required = true) int b){
    return a + b;
  }
}

