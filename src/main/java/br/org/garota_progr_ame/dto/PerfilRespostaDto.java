package br.org.garota_progr_ame.dto;

import java.sql.Timestamp;
import java.util.List;


import br.org.garota_progr_ame.domain.PerfilDomain;
import br.org.garota_progr_ame.domain.TelaDomain;
import br.org.garota_progr_ame.domain.TipoPerfilDomain;

public class PerfilRespostaDto {

    private int id;
    private String perfil;
    private String status;
    private Integer nivelHierarquico;
    private TipoPerfilDomain tipoPerfil;
    private Timestamp dataRegistro;
    private List<TelaDomain> telas;
    // private String strTelas;

    public PerfilRespostaDto() {}
    
    public PerfilRespostaDto(String perfil, String status, Integer nivelHierarquico, TipoPerfilDomain tipoPerfil,
            Timestamp dataRegistro, String strTelas) {
        this.perfil = perfil;
        this.status = status;
        this.nivelHierarquico = nivelHierarquico;
        this.tipoPerfil = tipoPerfil;
        this.dataRegistro = dataRegistro;
        // this.strTelas = strTelas;

        // JsonArray jsonArray = new JsonArray();
        // JsonObject json = new JsonObject(strTelas);
    }

    public PerfilRespostaDto(int id, String perfil, String status, Integer nivelHierarquico, TipoPerfilDomain tipoPerfil,
            Timestamp dataRegistro, List<TelaDomain> telas) {
        this.id = id;
        this.perfil = perfil;
        this.status = status;
        this.nivelHierarquico = nivelHierarquico;
        this.tipoPerfil = tipoPerfil;
        this.dataRegistro = dataRegistro;
        this.telas = telas;
    }

    public static PerfilRespostaDto toRespostaDto(PerfilDomain p) {
        return new PerfilRespostaDto(p.getIdPerfil(), p.getPerfil(), p.getStatus(), p.getNivelHierarquico(),
                p.getTipoPerfil(), p.getDataRegistro(), p.getTelas());
    }
    

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(Integer nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }

    public TipoPerfilDomain getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(TipoPerfilDomain tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    public Timestamp getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Timestamp dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public List<TelaDomain> getTelas() {
        return telas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}