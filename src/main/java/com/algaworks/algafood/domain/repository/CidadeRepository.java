package com.algaworks.algafood.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Cidade;

@Repository
public interface CidadeRepository {
	
	public List<Cidade> listarTodasCidades();
	
	public Cidade buscarCidadePorId(Long id);
	
	public Cidade salvarCidade(Cidade cidade);
	
	public void removerCidade(Cidade cidade);

}
