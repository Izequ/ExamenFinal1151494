package dao;

import org.springframework.data.repository.CrudRepository;

import entities.Numero;

public interface NumeroDao extends CrudRepository<Numero, Integer> {

}
