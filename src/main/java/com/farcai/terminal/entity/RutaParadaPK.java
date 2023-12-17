package com.farcai.terminal.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RutaParadaPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "idRuta", nullable = false)
    private Ruta ruta;

    @ManyToOne
    @JoinColumn(name = "idParroquia", nullable = false)
    private Parroquia parroquia;
}
