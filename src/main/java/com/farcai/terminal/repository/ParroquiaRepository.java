package com.farcai.terminal.repository;

import com.farcai.terminal.entity.Parroquia;
import com.farcai.terminal.projection.interfacebased.closed.ParroquiaClosedView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParroquiaRepository extends JpaRepository<Parroquia, Integer> {

    List<ParroquiaClosedView> findAllByCantonIdCanton(Integer idCanton);
}
