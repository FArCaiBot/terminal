package com.farcai.terminal.services;

import com.farcai.terminal.entity.Provincia;

import java.util.List;

public interface ProvinciaService {
    List<Provincia> findAll();

    Provincia findById(Integer id);
}
