package com.farcai.terminal.services;

import com.farcai.terminal.Exception.ResourceNotFoundException;
import com.farcai.terminal.entity.Dia;
import com.farcai.terminal.repository.DiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaServiceImpl implements DiaService {

    @Autowired
    private DiaRepository diaRepository;

    @Override
    public List<Dia> obtenerDias(Integer idOperadora) {
        return diaRepository.getDiasOperadora(idOperadora);
    }

    @Override
    public Dia obtenerPorId(Integer idDia) {
        return diaRepository.findById(idDia).orElseThrow(
                () -> new ResourceNotFoundException("Día", "id", idDia.toString())
        );
    }
}
