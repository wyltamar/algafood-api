package com.algaworks.algafood.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Permissao;

@Repository
public interface PermissaoRepository {
	
	public List<Permissao> listarPermissoes();
	
	public Permissao buscarPermissaoPorId(Long idPermissao);
	
	public Permissao salvarPermissao(Permissao permissao);
	
	public void removerPermissao(Permissao permissao);

}
