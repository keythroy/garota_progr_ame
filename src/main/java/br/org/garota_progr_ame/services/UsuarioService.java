package br.org.garota_progr_ame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.garota_progr_ame.model.UsuarioModel;
import br.org.garota_progr_ame.repository.UsuarioRepository;


@Service
public class UsuarioService {
    
    @Autowired
    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository r) {
        this.repo = r;
    }

    public List<UsuarioModel> listar() {
        List<UsuarioModel> resp = repo.findAll();
        return resp;
    }

    public UsuarioModel salvar(UsuarioModel p) {
        return repo.save(p);
    }

    // @PostMapping(value = "/save", consumes = "application/x-www-form-urlencoded")
    // public @ResponseBody ResponseEntity<UsuarioModel> save(UsuarioModel Usuario) {
    // try {
    // UsuarioModel save = repo.save(Usuario);
    // return new ResponseEntity<>(save, HttpStatus.OK);
    // } catch (Exception e) {
    // return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    // }
    // }

}
