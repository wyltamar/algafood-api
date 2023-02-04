package com.algaworks.algafood.listner;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {

	@EventListener
	public void clienteAtivadoListner(ClienteAtivadoEvent event) {
		
		System.out.println("Noata fiscal enviada para o cliente: "+event.getCliente().getNome());
		
	}
}
