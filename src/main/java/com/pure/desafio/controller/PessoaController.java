package com.pure.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pure.desafio.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

  @Autowired
  PessoaService pessoaService;

  public PessoaController() {
    pessoaService = new PessoaService();
  }

  @GetMapping("/")
  public ResponseEntity<String> findAll() {
    return ResponseEntity.ok().body(pessoaService.findAll());
  }

}
