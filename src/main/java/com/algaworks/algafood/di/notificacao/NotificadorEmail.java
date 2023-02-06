package com.algaworks.algafood.di.notificacao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.model.Cliente;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {
	
	@Value("${notificador.email.host-servidor}")
	private String host;
	
	@Value("${notificador.email.porta-servidor}")
	private Integer porta;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Host: " +host);
		System.out.println("Porta: " + porta);
				
		System.out.printf("Notificando %s através do email %s : %s\n", 
						cliente.getNome(),cliente.getEmail(),mensagem);
	}
	

}
