package com.farcai.terminal.projection.interfacebased.closed;

import com.farcai.terminal.entity.Dia;

import java.time.LocalTime;

public interface HorarioAtencionView {
    LocalTime getHorarioApertura();
    LocalTime getHoraCierre();
    Dia getDia();
}
