package com.farcai.terminal.controller;

import com.farcai.terminal.entity.HorarioAtencion;
import com.farcai.terminal.projection.classbased.HorarioInputDto;
import com.farcai.terminal.services.HorarioAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/horario")
public class HorarioController {

    @Autowired
    private HorarioAtencionService horarioAtencionService;

    @PostMapping
    public ResponseEntity<HorarioAtencion> guardarHorario(@RequestBody HorarioInputDto horario) {
        return new ResponseEntity<>(horarioAtencionService.guardar(horario), HttpStatus.CREATED);
    }

    @DeleteMapping("/{idOperadora}/dia/{idDia}")
    public ResponseEntity<String> eliminarHorarioAtencion(@PathVariable Integer idOperadora,
                                                          @PathVariable Integer idDia) {
        return ResponseEntity.ok(horarioAtencionService.eliminarHorario(idOperadora, idDia));
    }
}
