package br.org.garota_progr_ame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.org.garota_progr_ame.domain.PerfilDomain;

import java.util.List;

public interface PerfilRepository extends JpaRepository<PerfilDomain, Integer> {

    @Query(nativeQuery = true, value = "select * from AG_T_PERFIL p where p.PERFIL like %:name%")
    List<PerfilDomain> findByAdm(@Param("name") String name);

    // @Query(nativeQuery = true, value = "select * from AG_T_PERFIL p where
    // p.PERFIL like %:name%")
    // List<AgTTela> getTelas();
}