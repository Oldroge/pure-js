package com.pure.desafio.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import com.pure.desafio.model.Pessoa;
import com.pure.desafio.repository.JDBCRepository;

@Service
public class PessoaService {
  @Autowired
  private JDBCRepository jdbcRepository;
  private Gson gson;

  public PessoaService() {
    this.jdbcRepository = new JDBCRepository();
    this.gson = new Gson();
  }

  public String findAll() {
    ArrayList<Pessoa> allPessoas = jdbcRepository.findAll();
    return gson.toJson(allPessoas);
  }

}
