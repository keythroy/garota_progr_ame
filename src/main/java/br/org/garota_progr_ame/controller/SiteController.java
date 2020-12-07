package br.org.garota_progr_ame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

	@GetMapping("/site")
	public String init() {
		return "Site/index";
	}

	@GetMapping("/cadastro")
	public String cadastro() {
		return "Site/cadastro";
	}

}
