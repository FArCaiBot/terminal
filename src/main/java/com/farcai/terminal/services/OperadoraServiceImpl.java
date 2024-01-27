package com.farcai.terminal.services;

import com.farcai.terminal.Exception.ResourceNotFoundException;
import com.farcai.terminal.entity.Operadora;
import com.farcai.terminal.repository.OperadoraRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class OperadoraServiceImpl implements OperadoraService {

    @Autowired
    private OperadoraRepository operadoraRepository;

    @Autowired
    private CloudinaryService cloudinaryService;


    @Override
    public List<Operadora> findByNombreOperadora(String nombreOperadora) {
        return operadoraRepository.findByNombreOperadora(nombreOperadora);
    }

    @Override
    public Operadora guardar(String nombreOperadora, MultipartFile logo) {
        Operadora operadora=new Operadora();
        operadora.setNombreOperadora(nombreOperadora);
        try {
            String linkLogo = cloudinaryService.uploadFile(logo);
            operadora.setLogotipo(linkLogo);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return operadoraRepository.save(operadora);
    }

    @Transactional
    @Override
    public Operadora actualizar(MultipartFile logo, String nombreOperadora, Integer idOperadora) {
        Operadora operadoraDb = operadoraRepository.findById(idOperadora).orElseThrow(
                () -> new ResourceNotFoundException("Operadora", "id", idOperadora.toString())
        );
        String newFile = cloudinaryService.changeFile(logo, operadoraDb.getLogotipo());
        operadoraDb.setNombreOperadora(nombreOperadora);
        operadoraDb.setLogotipo(newFile);
        return operadoraRepository.save(operadoraDb);
    }
}
