package com.pure.desafio.repository;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import com.pure.desafio.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, String> {
  public ArrayList<Pessoa> findAll();
}
