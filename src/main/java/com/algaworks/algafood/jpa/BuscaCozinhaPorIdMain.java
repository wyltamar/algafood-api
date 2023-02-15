package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class BuscaCozinhaPorIdMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
	    CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
	    Cozinha cozinha = cadastroCozinha.buscar(2L);
	    
	    
			System.out.println("Nome da Cozinha: "+cozinha.getNome());
			System.out.println("Id: "+cozinha.getId());
		
		
	}
}
