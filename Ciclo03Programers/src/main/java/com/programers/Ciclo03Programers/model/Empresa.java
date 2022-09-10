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
@Table(name = "enterprises")
public class Empresa {


    @Column(length = 50, nullable = false)
    private String nombreEmpresa;

    @Column(length = 50, nullable = false)
    private String direccion;

    @Column(length = 50, nullable = false)
    private String telefono;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long nitEmpresa;

    @OneToMany
    @JoinColumn(name = "idEmp", nullable = false)
    private Empleado empleado;

    @OneToMany
    @JoinColumn(name = "idMov", nullable = false)
    private MovimientoDinero movimientoDinero;



        
}



