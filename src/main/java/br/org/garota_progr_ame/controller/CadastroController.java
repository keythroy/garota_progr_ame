package br.org.garota_progr_ame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroController {
    	
	@GetMapping("/cadastro")
	public String init() {
		return "Site/cadastro";		
	}
}
