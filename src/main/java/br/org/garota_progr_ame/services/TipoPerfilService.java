package br.org.garota_progr_ame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.org.garota_progr_ame.domain.TipoPerfilDomain;

import br.org.garota_progr_ame.repository.TipoPerfilRepository;

@RestController
@RequestMapping("/tipoperfil")
public class TipoPerfilService {

    @Autowired
    private TipoPerfilRepository repo;

    TipoPerfilService(TipoPerfilRepository repo) {
        this.repo = repo;
    }

    @GetMapping(value= "/get")
    public List<TipoPerfilDomain> get(){
        List<TipoPerfilDomain> resp = repo.findAll();
        return resp ;  
    }   

}
