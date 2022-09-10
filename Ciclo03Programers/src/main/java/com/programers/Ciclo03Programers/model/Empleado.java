package com.programers.Ciclo03Programers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmp;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String correo;

    @Column(length = 50, nullable = false)
    private String empresaEmpleado;

    @Column(length = 50, nullable = false)
    private String rolEmpleado;

    @ManyToOne
    @JoinColumn(name = "nitEmpresa",nullable = false)
    private Empresa empresa;

    @ManyToMany
    @JoinColumn(name = "idMov",nullable = false)
    private MovimientoDinero movimientoDinero ;



}
