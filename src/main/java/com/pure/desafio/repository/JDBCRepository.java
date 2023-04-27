package com.pure.desafio.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.pure.desafio.jdbc.connection.JDBCConnection;
import com.pure.desafio.model.Pessoa;

@Repository
public class JDBCRepository implements PessoaRepository {
  @Autowired
  private JDBCConnection connection;

  public JDBCRepository() {
    connection = new JDBCConnection();
  }

  @Override
  public ArrayList<Pessoa> findAll() {
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    Statement statement;
    try {
      statement = connection.getConnection().createStatement();
      ResultSet result = statement.executeQuery("select * from pure.Pessoas");
      while (result.next()) {
        String name = result.getString("nome");
        String email = result.getString("email");
        String phoneNumber = result.getString("telefone");
        String profession = result.getString("profissao");
        Pessoa pessoa = new Pessoa(name, email, phoneNumber, profession);
        pessoas.add(pessoa);
      }
      return pessoas;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      connection.closeConnection();
    }
    return null;
  }

  @Override
  public <S extends Pessoa> S save(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Pessoa> Iterable<S> saveAll(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Pessoa> findById(String id) {
    // TODO Auto-generated method stub
    return Optional.empty();
  }

  @Override
  public boolean existsById(String id) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Iterable<Pessoa> findAllById(Iterable<String> ids) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public long count() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void deleteById(String id) {
    // TODO Auto-generated method stub

  }

  @Override
  public void delete(Pessoa entity) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteAllById(Iterable<? extends String> ids) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteAll(Iterable<? extends Pessoa> entities) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deleteAll() {
    // TODO Auto-generated method stub

  }

}
