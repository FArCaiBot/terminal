package com.farcai.terminal.repository;

import com.farcai.terminal.entity.HorarioAtencion;
import com.farcai.terminal.entity.HorarioAtencionPK;
import com.farcai.terminal.projection.interfacebased.closed.HorarioAtencionView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioAtencionRepository extends JpaRepository<HorarioAtencion, HorarioAtencionPK> {
}
