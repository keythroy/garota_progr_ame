package br.org.garota_progr_ame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.garota_progr_ame.domain.TelaDomain;
import br.org.garota_progr_ame.repository.TelaRepository;

@Service
public class TelaService {

    private final TelaRepository repo;

    @Autowired
    public TelaService(TelaRepository r) {
        this.repo = r;
    }

    public List<TelaDomain> listar() {
        List<TelaDomain> resp = repo.findAll();
        return resp;
    }

    public TelaDomain salvar(TelaDomain p) {
        return repo.save(p);
    }

}
