package br.org.garota_progr_ame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import org.springframework.data.repository.query.Param;
import br.org.garota_progr_ame.domain.PerfilamentoDomain;


public interface PerfilamentoRepository extends JpaRepository<PerfilamentoDomain, Integer> {    
 
    @Query(nativeQuery =true,value = "SELECT * FROM AG_T_PERFILAMENTO where ID_COD_EXAME = :id")
    List<PerfilamentoDomain> findPerfilamento(@Param("id") String id); 
}
