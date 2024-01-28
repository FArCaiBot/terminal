package com.farcai.terminal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Dia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDia;
    private String nombreDia;
}
