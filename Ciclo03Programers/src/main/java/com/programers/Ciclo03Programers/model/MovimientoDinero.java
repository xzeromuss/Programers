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
@Table(name = "movimientos")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private Long idMov;

    @Column(length = 50, nullable = false)
    private double montoMovimiento;

    @Column(length = 50, nullable = false)
    private String conceptoMovimiento;

    @ManyToOne
    @JoinColumn(name = "nitEmpresa",nullable = false)
    private Empresa empresaMov;

    @ManyToOne
    @JoinColumn(name = "idEmp",nullable = false)
    private Empleado empleadoMov;



    public double monto(){
        return -1;
    }
    public String UsuarioEncargado(){
        return "-1";
    }



}
