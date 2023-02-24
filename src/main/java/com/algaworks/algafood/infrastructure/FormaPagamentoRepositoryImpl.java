package com.algaworks.algafood.infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;

@Repository
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {
	
	@PersistenceContext
	private EntityManager manager;

	/**
	 * Este método é utilizado para buscar todas
	 * entidades do tipo FormaPagamento na base
	 * de dados.
	 * @return retorna uma List<FormaPagamento>
	 */
	@Override
	public List<FormaPagamento> listar() {
		return manager.createQuery("from FormaPagamento", FormaPagamento.class)
				.getResultList();
	}

	/**
	 * Este método é responsável por fazer a 
	 * busca por id da entidade FormaPagamento no banco de dados.
	 * @param id
	 * @return retorna a classe FormaPagamento
	 */
	@Override
	public FormaPagamento buscar(Long id) {
		return manager.find(FormaPagamento.class, id);
	}

	/**
	 * Salva a entidade FormaPagamento na base de dados.
	 * @param formaPagamento
	 * @return objeto do tipo FormaPagamento
	 */
	@Override
	@Transactional
	public FormaPagamento salvar(FormaPagamento formaPagamento) {
		return manager.merge(formaPagamento);
	}
	
	/**
	 * Remove a entidade caso a mesma exista no banco de dados.
	 * @param formaPagamento
	 */
	@Override
	@Transactional
	public void remover(FormaPagamento formaPagamento) {
		
		formaPagamento = buscar(formaPagamento.getId());
		
		manager.remove(formaPagamento);
		
	}

}
