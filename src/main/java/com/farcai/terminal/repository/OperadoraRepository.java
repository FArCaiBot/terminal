package com.farcai.terminal.repository;

import com.farcai.terminal.entity.Operadora;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OperadoraRepository extends CrudRepository<Operadora,Integer> {

    @Query("Select o from Operadora o " +
            "where (:nombreOperadora is null " +
            "or lower(o.nombreOperadora) like lower(concat('%',:nombreOperadora,'%')))")
    List<Operadora> findByNombreOperadora(
            @Param("nombreOperadora") String nombreOperadora);
}
