package com.farcai.terminal.services;

import com.farcai.terminal.entity.Dia;

import java.util.List;


public interface DiaService {

    List<Dia> obtenerDias(Integer idDia);

    Dia obtenerPorId(Integer idDia);
}
