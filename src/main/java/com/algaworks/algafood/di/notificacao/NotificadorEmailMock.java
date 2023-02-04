package com.algaworks.algafood.di.notificacao;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
				
		System.out.printf("Deveria ser enviado para %s através do email %s : %s\n", 
						cliente.getNome(),cliente.getEmail(),mensagem);
	}
	

}
