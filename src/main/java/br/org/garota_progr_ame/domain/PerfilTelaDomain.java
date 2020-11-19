package br.org.garota_progr_ame.domain;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "AG_T_PERFIL_TELA")
public class PerfilTelaDomain implements Serializable {

  private static final long serialVersionUID = 1;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ID\"")
  private Integer id;

  @ManyToOne
  @MapsId("idPerfil")
  private PerfilDomain perfil;

  @ManyToOne
  @MapsId("idTela")
  private TelaDomain tela;

  PerfilTelaDomain() {
  }

  public PerfilTelaDomain(PerfilDomain perfil, TelaDomain tela) {
    this.perfil = perfil;
    this.tela = tela;
  }
  
  

}