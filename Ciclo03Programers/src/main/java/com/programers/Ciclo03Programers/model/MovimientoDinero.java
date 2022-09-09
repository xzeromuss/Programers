package com.programers.Ciclo03Programers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity

public class MovimientoDinero {

    @Column(length = 50, nullable = false)
    private double montoMovimiento;

    @Column(length = 50, nullable = false)
    private String conceptoMovimiento;

    @Column(length = 50, nullable = false)
    private String usuarioEncargado;


    public double monto(){
        return -1;
    }
    public String UsuarioEncargado(){
        return "-1";
    }



}
