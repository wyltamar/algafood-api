package com.algaworks.algafood.infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;

public class CidadeRepositoryImplementacao implements CidadeRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Cidade> listarTodasCidades() {
		return manager.createQuery("from Cidade",Cidade.class).getResultList();
	}

	@Override
	public Cidade buscarCidadePorId(Long id) {
		return manager.find(Cidade.class, id);
	}

	@Override
	@Transactional
	public Cidade salvarCidade(Cidade cidade) {		
		return manager.merge(cidade);
	}

	@Override
	@Transactional
	public void removerCidade(Cidade cidade) {
		cidade = this.buscarCidadePorId(cidade.getId());
		manager.remove(cidade);
	}

}
