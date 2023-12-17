package com.farcai.terminal.repository;

import com.farcai.terminal.entity.Canton;
import com.farcai.terminal.projection.interfacebased.closed.CantonClosedView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CantonRepository extends JpaRepository<Canton,Integer> {
    List<CantonClosedView> findAllByProvinciaIdProvincia(Integer idProvincia);
}
