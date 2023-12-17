package com.farcai.terminal.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class HorarioAtencionPK implements Serializable {



    @ManyToOne
    @JoinColumn(name = "idOperadora",nullable = false)
    private Operadora operadora;

    @ManyToOne
    @JoinColumn(name = "idDia",nullable = false)
    private Dia dia;
}
