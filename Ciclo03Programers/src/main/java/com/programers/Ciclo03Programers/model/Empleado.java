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

    @ManyToOne(targetEntity = Empresa.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "nitEmpresa",nullable = false)
    private List<Empresa> empresa;


    @ManyToMany(targetEntity = MovimientoDinero.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idMov",nullable = false)
    private List<MovimientoDinero> movimientoDineroList;


}
