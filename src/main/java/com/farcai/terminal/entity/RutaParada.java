package com.farcai.terminal.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(RutaParadaPK.class)
public class RutaParada {
    @Id
    private Ruta ruta;
    @Id
    private Parroquia parroquia;
    private Integer orden;
    private Boolean paradaVigencia;
}
