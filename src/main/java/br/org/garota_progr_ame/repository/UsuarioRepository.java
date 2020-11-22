package br.org.garota_progr_ame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.garota_progr_ame.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

}