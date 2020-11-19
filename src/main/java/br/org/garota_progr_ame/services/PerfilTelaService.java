package br.org.garota_progr_ame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.garota_progr_ame.domain.PerfilDomain;
import br.org.garota_progr_ame.domain.PerfilTelaDomain;
import br.org.garota_progr_ame.domain.TelaDomain;
import br.org.garota_progr_ame.repository.PerfilTelaRepository;

@Service
public class PerfilTelaService {

    @Autowired
    private PerfilTelaRepository repo;

    PerfilTelaService(PerfilTelaRepository r) {
        this.repo = r;
    }

    public void inserePerfilTela(PerfilDomain perfil, List<TelaDomain> telas) {
        for(TelaDomain t: telas){
            PerfilTelaDomain item = new PerfilTelaDomain(perfil, t);
            repo.save(item);
        }
        
    }

}
