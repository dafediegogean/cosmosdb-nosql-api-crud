package com.br.cosmosdb.nosql.api.crud.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.br.cosmosdb.nosql.api.crud.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	
	public Optional<Usuario> findByEmailId(String emailId);
	
}
