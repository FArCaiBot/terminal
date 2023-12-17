package com.farcai.terminal.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parroquia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idParroquia;
    private String nombreParroquia;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idCanton")
    private Canton canton;
}
