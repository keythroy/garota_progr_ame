package br.org.garota_progr_ame.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.org.garota_progr_ame.domain.PerfilamentoDomain;

import br.org.garota_progr_ame.repository.PerfilamentoRepository;

@RestController
@RequestMapping("/perfilamento")
public class PerfilamentoService {

    private final PerfilamentoRepository repo;

    @Autowired
    public PerfilamentoService(PerfilamentoRepository r) {
        this.repo = r;
    }

    @GetMapping(value= "/get")
    public List<PerfilamentoDomain> get(@RequestParam("codigoExame") String codigoExame){
        List<PerfilamentoDomain> resp = repo.findPerfilamento(codigoExame);
        return resp ;  
    }   



}
