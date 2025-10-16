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
  public String suma(@RequestParam(name = "a", required = true) int a,
                  @RequestParam(name = "b", required = true) int b){
    String password = "P@ssw0rd123"; // Example of a hardcoded password (not recommended)
    int result = a + b;
    String txtResult = "El resultado de la suma es : " + Integer.toString(result) + " " + password ;
    return txtResult; // Intentional type mismatch for testing purposes

  }
}

