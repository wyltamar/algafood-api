package com.algaworks.algafood.infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;

/**
 * Esta classe impementa os métodos da interface EstadoRepository
 * @author wyltamar
 *
 */
public class EstadoRepositoryImplementacao implements EstadoRepository {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Estado> listarTodosEstados() {
		return manager.createQuery("from Estado", Estado.class).getResultList();
	}

	@Override
	public Estado buscarEstadoPorId(Long idEstado) {
		return manager.find(Estado.class,idEstado);
	}

	@Override
	@Transactional
	public Estado salvarEstado(Estado estado) {
		return manager.merge(estado);
	}

	@Override
	@Transactional
	public void removerEstado(Estado estado) {
		estado = this.buscarEstadoPorId(estado.getId());
		manager.remove(estado);
	}

}
