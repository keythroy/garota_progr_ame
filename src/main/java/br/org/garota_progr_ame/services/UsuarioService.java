package br.org.garota_progr_ame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.org.garota_progr_ame.domain.UsuarioDomain;

import br.org.garota_progr_ame.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    @GetMapping(value= "/get")
    public List<UsuarioDomain> get() {
        List<UsuarioDomain> resp = repo.findAll();
        return resp;
    }

    @PostMapping(value = "/save")
    public @ResponseBody ResponseEntity<UsuarioDomain> save(@RequestBody UsuarioDomain u) {
        try {
            UsuarioDomain save = repo.save(u);
            return new ResponseEntity<>(save, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
