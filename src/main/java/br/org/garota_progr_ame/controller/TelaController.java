package br.org.garota_progr_ame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.garota_progr_ame.domain.TelaDomain;
import br.org.garota_progr_ame.services.TelaService;

import java.util.List;

@RequestMapping("/tela")
@RestController
public class TelaController {

    private final TelaService service;

    @Autowired
    public TelaController(TelaService s) {
        this.service = s;
    }

    @GetMapping(value = "/get")
    public ResponseEntity<List<TelaDomain>> listar() {

        List<TelaDomain> telas = service.listar();
        return new ResponseEntity<List<TelaDomain>>(telas, HttpStatus.CREATED);
    }
    
    @PostMapping(value = "/save")
    public ResponseEntity<TelaDomain> salvar(@RequestBody TelaDomain dto) {

        System.out.println(dto.toString());
        TelaDomain tela = service.salvar(dto);
        return new ResponseEntity<>((tela), HttpStatus.CREATED);
    }
    
}