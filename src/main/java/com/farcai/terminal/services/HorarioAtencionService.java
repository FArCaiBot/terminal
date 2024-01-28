package com.farcai.terminal.services;

import com.farcai.terminal.entity.HorarioAtencion;
import com.farcai.terminal.projection.classbased.HorarioInputDto;

public interface HorarioAtencionService {
    HorarioAtencion guardar(HorarioInputDto horarioAtencion);

    String eliminarHorario(Integer idOperadora, Integer idDia);
}
