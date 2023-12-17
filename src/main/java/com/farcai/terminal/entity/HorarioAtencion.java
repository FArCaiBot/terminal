package com.farcai.terminal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(HorarioAtencionPK.class)
public class HorarioAtencion {

    @Id
    private Operadora operadora;

    @Id
    private Dia dia;

    private LocalTime horaApertura;
    private LocalTime horaCierra;

}
