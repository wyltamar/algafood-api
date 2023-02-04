package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
				
		System.out.printf("Notificando %s por SMS %s : %s\n", 
						cliente.getNome(),cliente.getTelefone(),mensagem);
	}
	

}
