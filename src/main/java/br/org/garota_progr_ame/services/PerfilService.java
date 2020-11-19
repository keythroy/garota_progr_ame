package br.org.garota_progr_ame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.garota_progr_ame.domain.PerfilDomain;
import br.org.garota_progr_ame.repository.PerfilRepository;

@Service
public class PerfilService {

    private final PerfilRepository repo;

    @Autowired
    public PerfilService(PerfilRepository r) {
        this.repo = r;
    }
    
    public List<PerfilDomain> listar() {
        List<PerfilDomain> resp = repo.findAll();
        return resp;
    }

    public PerfilDomain salvar(PerfilDomain p) {
        return repo.save(p);
    }
    
    
    // @PostMapping(value = "/save", consumes = "application/x-www-form-urlencoded")
    // public @ResponseBody ResponseEntity<PerfilDomain> save(PerfilDomain perfil) {
    //     try {
    //         PerfilDomain save = repo.save(perfil);
    //         return new ResponseEntity<>(save, HttpStatus.OK);
    //     } catch (Exception e) {
    //         return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }

}
