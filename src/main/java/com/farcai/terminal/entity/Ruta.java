package com.farcai.terminal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRuta;

    @ManyToOne(optional = false)
    @JoinColumn(name = "operadoraId")
    private Operadora operadora;

    @ManyToOne(optional = false)
    @JoinColumn(name = "origen")
    private Parroquia origen;

    @ManyToOne(optional = false)
    @JoinColumn(name = "destino")
    private Parroquia destino;

    @OneToMany(mappedBy = "ruta")
    private List<HorarioRuta> horarioRuta;

    private String nota;
    private Boolean rutaVigencia;
}
