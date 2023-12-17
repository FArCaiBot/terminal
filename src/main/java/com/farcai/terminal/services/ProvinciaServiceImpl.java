package com.farcai.terminal.services;

import com.farcai.terminal.entity.Provincia;
import com.farcai.terminal.repository.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Override
    public List<Provincia> findAll() {
        return provinciaRepository.findAll();
    }

    @Override
    public Provincia findById(Integer id) {
        return provinciaRepository.findById(id).orElseThrow(() -> new RuntimeException("No encontrado"));
    }

}
