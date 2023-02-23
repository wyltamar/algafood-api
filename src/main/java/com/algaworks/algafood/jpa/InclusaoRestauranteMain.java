package com.algaworks.algafood.jpa;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;


public class InclusaoRestauranteMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		
		Restaurante restaurante = new Restaurante();
		restaurante.setNome("Bom Prato");
		restaurante.setTaxaFrete(new BigDecimal(20));
		
		 restaurante = restauranteRepository.salvar(restaurante);
		 
		 System.out.printf(" id: %d\n Restaurante: %s\n taxa:  %.2f\n", restaurante.getId(),restaurante.getNome(),restaurante.getTaxaFrete());
	}
}
