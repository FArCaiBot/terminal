package com.farcai.terminal.repository;

import com.farcai.terminal.entity.Dia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DiaRepository extends JpaRepository<Dia, Integer> {

    @Query("SELECT d FROM Dia d " +
            "where d.idDia NOT IN " +
            "(SELECT h.dia.idDia FROM Operadora o " +
            "join HorarioAtencion h ON h.operadora.idOperadora = o.idOperadora " +
            "WHERE o.idOperadora=:idOperadora)")
    List<Dia> getDiasOperadora(Integer idOperadora);
}
