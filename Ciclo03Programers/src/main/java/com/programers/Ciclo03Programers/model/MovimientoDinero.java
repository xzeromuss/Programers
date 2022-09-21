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

    @ManyToOne(targetEntity = Empresa.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "nitEmpresa",nullable = false)
    private List<Empresa> empresa;


    @ManyToMany(targetEntity = Empleado.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idEmp",nullable = false)
    private List<Empleado> movimientoDineroList;



    public double monto(){
        return -1;
    }
    public String UsuarioEncargado(){
        return "-1";
    }



}
