package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.model.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
	}
	
	@GetMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		
		Cliente joao = new Cliente("João da Silva","eamail@hotmal.com","83 3435-1178");
		
		ativacaoClienteService.ativar(joao);
		
		return "Bem vindo ao curso ESR da Alga Works!";
	}

}
