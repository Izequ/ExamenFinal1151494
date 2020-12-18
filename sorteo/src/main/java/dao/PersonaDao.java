package dao;

import org.springframework.data.repository.CrudRepository;

import entities.Persona;

public interface PersonaDao extends CrudRepository<Persona, Integer> {

}
