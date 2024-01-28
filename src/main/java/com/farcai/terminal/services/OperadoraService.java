package com.farcai.terminal.services;

import com.farcai.terminal.entity.Operadora;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface OperadoraService {


    List<Operadora> findByNombreOperadora(String nombreOperadora);

    Operadora guardar(String nombreOperadora, MultipartFile logo);

    Operadora actualizar(MultipartFile logo, String nombreOperadora, Integer idOperadora);

    Operadora obtenerPorId(Integer idOperadora);
}
