package com.farcai.terminal.controller;

import com.farcai.terminal.entity.Operadora;
import com.farcai.terminal.services.OperadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/operadora")
public class OperadoraController {

    @Autowired
    private OperadoraService operadoraService;

    @GetMapping
    public ResponseEntity<List<Operadora>> listarOperadoras(
            @RequestParam(required = false, defaultValue = "")
            String nombreOperadora) {
        return ResponseEntity.ok().body(operadoraService.findByNombreOperadora(nombreOperadora));
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Operadora> guardarNuevo(@RequestPart(value = "file") MultipartFile logo,
                                                  @RequestParam String nombreOperadora) {
        return new ResponseEntity<>(operadoraService.guardar(nombreOperadora, logo), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{idOperadora}", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Operadora> editarOperadora(@PathVariable Integer idOperadora,
                                                     @RequestPart(value = "file", required = false) MultipartFile logo,
                                                     @RequestParam String nombreOperadora) {
        return new ResponseEntity<>(operadoraService.actualizar(logo,nombreOperadora,idOperadora),HttpStatus.OK);
    }


}
