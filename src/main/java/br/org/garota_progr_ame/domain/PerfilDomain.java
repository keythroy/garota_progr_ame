package br.org.garota_progr_ame.domain;

import java.io.Serializable;
import java.sql.*;
import java.util.List;

import javax.persistence.*;

@Entity(name = "perfil")
@Table(name = "AG_T_PERFIL")
public class PerfilDomain implements Serializable {

  private static final long serialVersionUID = 1;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ID_PERFIL\"")
  private Integer idPerfil;

  @Column(name = "\"PERFIL\"", nullable = true)
  private String perfil;

  @Column(name = "\"Status\"", nullable = true)
  private String status;

  @Column(name = "\"NIVEL_HIERARQUICO\"", nullable = true)
  private Integer nivelHierarquico;

  @ManyToOne
  @JoinColumn(name = "ID_TIPO_PERFIL")
  private TipoPerfilDomain tipoPerfil;

  @Column(name = "\"DATA_REGISTRO\"", nullable = true)
  private Timestamp dataRegistro;

  @ManyToMany(targetEntity = TelaDomain.class)
  @JoinTable(name = "AG_T_PERFIL_TELA", joinColumns = @JoinColumn(name = "ID_PERFIL"), inverseJoinColumns = @JoinColumn(name = "ID_TELA"))
  private List<TelaDomain> telas;

  public PerfilDomain(){}

  public PerfilDomain(String perfil, String status, Integer nivelHierarquico, TipoPerfilDomain tipoPerfil,
      Timestamp dataRegistro) {
    this.perfil = perfil;
    this.status = status;
    this.nivelHierarquico = nivelHierarquico;
    this.tipoPerfil = tipoPerfil;
    this.dataRegistro = dataRegistro;
  }


  public Integer getIdPerfil() {
    return idPerfil;
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

  public void setTelas(List<TelaDomain> telas) {
    this.telas = telas;
  }


  
}