package com.algaworks.algafood.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Cozinha;

@Repository
public interface CozinhaRepository {
	
	public List<Cozinha> listar();
	
	public Cozinha buscarPorId(Long id);
	
	public Cozinha salvar(Cozinha cozinha);
	
	public void remove(Cozinha cozinha);

}
