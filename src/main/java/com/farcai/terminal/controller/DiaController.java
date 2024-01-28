package com.farcai.terminal.controller;

import com.farcai.terminal.entity.Dia;
import com.farcai.terminal.services.DiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dia")
public class DiaController {

    @Autowired
    private DiaService diaService;

    @GetMapping("/{idOperadora}/operadora")
    public ResponseEntity<List<Dia>> listarDias(@PathVariable Integer idOperadora) {
        return ResponseEntity.ok(diaService.obtenerDias(idOperadora));
    }
}
