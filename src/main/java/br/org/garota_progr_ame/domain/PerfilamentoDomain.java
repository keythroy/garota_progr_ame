package br.org.garota_progr_ame.domain;

import java.io.Serializable;


import javax.persistence.*;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "AG_T_PERFILAMENTO")
public class PerfilamentoDomain implements Serializable {    

  @Id
  @Column(name = "\"ID_PERFILAMENTO\"", nullable = false)
  private Integer idPerfilamento;
  @Column(name = "\"PERFILAMENTO\"", nullable = true)
  private String perfilamento;
  @Column(name = "\"ID_COD_EXAME\"", nullable = true)
  private Integer idCodExame;
  @Column(name = "\"ID_TRATATIVA\"", nullable = true)
  private Integer idTratativa;
  @Column(name = "\"TRATATIVA\"", nullable = true)
  private String tratativa;

	public Integer getIdPerfilamento() {
		return idPerfilamento;
	}

	public void setIdPerfilamento(Integer idPerfilamento) {
		this.idPerfilamento = idPerfilamento;
	}

	public String getPerfilamento() {
		return perfilamento;
	}

	public void setPerfilamento(String perfilamento) {
		this.perfilamento = perfilamento;
	}

	public Integer getIdCodExame() {
		return idCodExame;
	}

	public void setIdCodExame(Integer idCodExame) {
		this.idCodExame = idCodExame;
	}

	public Integer getIdTratativa() {
		return idTratativa;
	}

	public void setIdTratativa(Integer idTratativa) {
		this.idTratativa = idTratativa;
	}

	public String getTratativa() {
		return tratativa;
	}

	public void setTratativa(String tratativa) {
		this.tratativa = tratativa;
	}

	@Override
	public String toString() {
		return "PerfilamentoDomain [idCodExame=" + idCodExame + ", idPerfilamento=" + idPerfilamento + ", idTratativa="
				+ idTratativa + ", perfilamento=" + perfilamento + ", tratativa=" + tratativa + "]";
	}
    

    
}
