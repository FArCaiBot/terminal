package com.farcai.terminal.controller;


import com.farcai.terminal.entity.Provincia;
import com.farcai.terminal.projection.interfacebased.closed.CantonClosedView;
import com.farcai.terminal.projection.interfacebased.closed.ParroquiaClosedView;
import com.farcai.terminal.services.CantonService;
import com.farcai.terminal.services.ParroquiaService;
import com.farcai.terminal.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/geografia")
public class GeografiaController {

    @Autowired
    ProvinciaService provinciaService;

    @Autowired
    CantonService cantonService;


    @Autowired
    ParroquiaService parroquiaService;

    @GetMapping("/provincias")
    public ResponseEntity<List<Provincia>> getProvincia() {
        return ResponseEntity.ok(provinciaService.findAll());
    }

    @GetMapping("/provincias/{idProvincia}/cantones")
    public ResponseEntity<List<CantonClosedView>> getCantonByIdProvincia(@PathVariable Integer idProvincia) {
        return ResponseEntity.ok(cantonService.getCantonByIdProvincia(idProvincia));
    }

    @GetMapping("/canton/{idCanton}/parroquias")
    public ResponseEntity<List<ParroquiaClosedView>> getParroquiaByIdCanton(@PathVariable Integer idCanton) {
        return ResponseEntity.ok(parroquiaService.getParroquiaByIdCanton(idCanton));
    }
}
