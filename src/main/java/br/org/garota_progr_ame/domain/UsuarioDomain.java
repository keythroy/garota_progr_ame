package br.org.garota_progr_ame.domain;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;

@Entity(name = "usuario")
@Table(name = "AG_T_USUARIO")
public class UsuarioDomain implements Serializable {

  private static final long serialVersionUID = 1;

  @Id
  @Column(name = "\"ID_USUARIO\"", nullable = false)
  private Integer idUsuario;

  @Column(name = "\"USUARIO\"", nullable = true)
  private String usuario;

  @Column(name = "\"NOME_EXIBICAO\"", nullable = false)
  private String nomeExibicao;

  @Column(name = "\"SENHA\"", nullable = true)
  private String senha;

  @Column(name = "\"BL_STATUS\"", nullable = true)
  private Integer blStatus;

  @Column(name = "\"MATRICULA\"", nullable = true)
  private String matricula;

  @ManyToOne(targetEntity = PerfilDomain.class)
  @JoinColumn(name = "ID_PERFIL")
  private PerfilDomain perfil;

  @Column(name = "\"DATA_REGISTRO\"", nullable = true)
  private Timestamp dataRegistro;

  public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getNomeExibicao() {
    return nomeExibicao;
  }

  public void setNomeExibicao(String nomeExibicao) {
    this.nomeExibicao = nomeExibicao;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Integer getBlStatus() {
    return blStatus;
  }

  public void setBlStatus(Integer blStatus) {
    this.blStatus = blStatus;
  }

  public Timestamp getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(Timestamp dataRegistro) {
    this.dataRegistro = dataRegistro;
  }
    
  public String getMatricula() {
    return matricula;
  }
  
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
  
  public PerfilDomain getPerfil() {
    return perfil;
  }
  
  public void setPerfil(PerfilDomain perfil) {
    this.perfil = perfil;
  }
  
  @Override
  public String toString() {
    return "UsuarioDomain [blStatus=" + blStatus + ", dataRegistro=" + dataRegistro 
        + ", idUsuario=" + idUsuario + ", nomeExibicao=" + nomeExibicao
        + ", senha=" + senha + ", usuario=" + usuario
        + "]";
  }
  
  
}