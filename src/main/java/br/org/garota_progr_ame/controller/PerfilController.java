package br.org.garota_progr_ame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.garota_progr_ame.dto.PerfilDto;
import br.org.garota_progr_ame.dto.PerfilRespostaDto;
import br.org.garota_progr_ame.domain.PerfilDomain;
import br.org.garota_progr_ame.services.PerfilService;
import br.org.garota_progr_ame.services.PerfilTelaService;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

    private final PerfilService service;
    private final PerfilTelaService servicePerfilTela;

    @PersistenceContext
    private EntityManager em;

    @Autowired
    public PerfilController(PerfilService s, PerfilTelaService st) {
        this.service = s;
        this.servicePerfilTela = st;
    }

    @GetMapping(value = "/get")
    public ResponseEntity<List<PerfilDomain>> listar() {
        try {
            List<PerfilDomain> perfis = service.listar();
            return new ResponseEntity<List<PerfilDomain>>(perfis, HttpStatus.ACCEPTED);
            
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
    
    @Transactional
    @PostMapping(value = "/save")
    public ResponseEntity<PerfilRespostaDto> salvar(PerfilDto dto) {

        try {
            Calendar calendar = Calendar.getInstance();
            Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());
            dto.setDataRegistro(currentTimestamp);
            
            PerfilDomain _perfil = dto.toObj();
            service.salvar(_perfil);
            servicePerfilTela.inserePerfilTela(_perfil, dto.getTelas());

            PerfilRespostaDto _resp = PerfilRespostaDto.toRespostaDto(_perfil);
    
            return new ResponseEntity<PerfilRespostaDto>(_resp, HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
        
    }
    
}