package br.org.garota_progr_ame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.garota_progr_ame.domain.UsuarioDomain;

public interface UsuarioRepository extends JpaRepository<UsuarioDomain, Integer> {

}