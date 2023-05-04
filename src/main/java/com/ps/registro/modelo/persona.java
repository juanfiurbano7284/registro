package com.ps.registro.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table
@Entity
@Data
@JsonIgnoreProperties({ "bookName", "bookCategory" })
public class persona {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombres", nullable=false, length=100)
    private String nombres;

    @Column(name="apellidos", nullable=false, length=100)
    private String apellidos;

    @Column(name="telefono", length=20)
    private String telefono;

    @Column(name="correo", length=100)
    private String correo;

    @Column(name="identificacion", length=100)
    private String identificacion;
}
