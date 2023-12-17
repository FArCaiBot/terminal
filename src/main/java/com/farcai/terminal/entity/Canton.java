package com.farcai.terminal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Canton {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCanton;
    private String nombreCanton;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idProvincia")
    private Provincia provincia;
}
