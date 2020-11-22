package br.org.garota_progr_ame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.garota_progr_ame.model.UsuarioModel;
import br.org.garota_progr_ame.services.UsuarioService;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService service;

    @PersistenceContext
    private EntityManager em;

    @Autowired
    public UsuarioController(UsuarioService s) {
        this.service = s;
    }

    @GetMapping(value = "/get")
    public ResponseEntity<List<UsuarioModel>> listar() {
        try {
            List<UsuarioModel> usuarios = this.service.listar();
            return new ResponseEntity<List<UsuarioModel>>(usuarios, HttpStatus.ACCEPTED);
            
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
    
    @Transactional
    @PostMapping(value = "/save")
    public ResponseEntity<UsuarioModel> salvar(UsuarioModel u) {

        try {
            Calendar calendar = Calendar.getInstance();
            Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
            u.setDataRegistro(currentTimestamp);

            UsuarioModel _resp = service.salvar(u);
    
            return new ResponseEntity<UsuarioModel>(_resp, HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
        
    }
    
}