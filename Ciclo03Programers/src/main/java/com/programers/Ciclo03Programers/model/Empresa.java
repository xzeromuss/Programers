package com.programers.Ciclo03Programers.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne(targetEntity = Empleado.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idEmp",nullable = false)
    private List<Empleado> empresa;


    @ManyToMany(targetEntity = MovimientoDinero.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idMov",nullable = false)
    private List<MovimientoDinero> movimientoDineroList;





        
}



