package com.farcai.terminal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HorarioRuta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHorarioRuta;
    private LocalTime horaRuta;
    private Boolean horarioRutaVigencia;

    @ManyToOne(optional = false)
    private Ruta ruta;

    @Enumerated(EnumType.ORDINAL)
    private TipoHorario tipo;
}
