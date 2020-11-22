package br.org.garota_progr_ame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String init() {
		return "Tema/blank";
		
	}

	@GetMapping("/usuarios")
	public String usuarios() {
		return "Usuario/index";

	}
}
