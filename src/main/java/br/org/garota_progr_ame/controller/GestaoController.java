package br.org.garota_progr_ame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/gestao")
public class GestaoController {
	
	@GetMapping("/perfis")
	public String init() {
		return "Gestao/perfis";
		
	}

	@GetMapping("/usuarios")
	public String users() {
		return "Gestao/usuarios";

	}

}
