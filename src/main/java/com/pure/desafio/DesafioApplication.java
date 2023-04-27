package com.pure.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import com.pure.desafio.controller.PessoaController;

@SpringBootApplication
public class DesafioApplication {

  public static void main(String[] args) {
    SpringApplication.run(DesafioApplication.class, args);

    PessoaController pessoaController = new PessoaController();

    ResponseEntity<String> pessoas = pessoaController.findAll();

    System.out.println(pessoas);

  }

}
