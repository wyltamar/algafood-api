package com.algaworks.algafood.di.notificacao;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
				
		System.out.printf("Notificando %s através do email %s : %s\n", 
						cliente.getNome(),cliente.getEmail(),mensagem);
	}
	

}
