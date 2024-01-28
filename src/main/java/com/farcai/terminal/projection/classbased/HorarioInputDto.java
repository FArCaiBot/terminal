package com.farcai.terminal.projection.classbased;

import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HorarioInputDto {
    private Integer idOperadora;
    private Integer idDia;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
}
