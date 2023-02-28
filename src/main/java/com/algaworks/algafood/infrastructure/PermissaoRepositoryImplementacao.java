package com.algaworks.algafood.infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;

@Component
public class PermissaoRepositoryImplementacao implements PermissaoRepository {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Permissao> listarPermissoes() {
		return manager.createNamedQuery("from Permissao",Permissao.class).getResultList();
	}

	@Override
	public Permissao buscarPermissaoPorId(Long idPermissao) {
		return manager.find(Permissao.class, idPermissao);
	}

	@Override
	@Transactional
	public Permissao salvarPermissao(Permissao permissao) {
		
		permissao = manager.merge(permissao);
		return permissao;
	}

	@Override
	@Transactional
	public void removerPermissao(Permissao permissao) {
		
		permissao = buscarPermissaoPorId(permissao.getId());
		
		manager.remove(permissao);
	}

}
