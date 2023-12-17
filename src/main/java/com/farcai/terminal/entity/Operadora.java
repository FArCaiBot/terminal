package com.farcai.terminal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Operadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOperadora;
    private String nombreOperadora;
    private String logotipo;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime fechaCreacion;


}
