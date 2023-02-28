package com.algaworks.algafood.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Estado;

@Repository
public interface EstadoRepository {
	
	public List<Estado> listarTodosEstados();
	
	public Estado buscarEstadoPorId(Long idEstado);
	
	public Estado salvarEstado(Estado estado);
	
	public void removerEstado(Estado estado);

}
