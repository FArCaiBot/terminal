package com.farcai.terminal.controller;

import com.farcai.terminal.entity.Provincia;
import com.farcai.terminal.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provincia")
public class ProvinciaController {

    @Autowired
    ProvinciaService provinciaService;

    @GetMapping
    public ResponseEntity<List<Provincia>> getProvincia(){
        return ResponseEntity.ok(provinciaService.findAll());
    }
}
