package com.programers.Ciclo03Programers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity

public class MovimientoDinero {
    private double montoMovimiento;
    private String conceptoMovimiento;
    private String usuarioEncargado;


    public double monto(){
        return -1;
    }
    public String UsuarioEncargado(){
        return "-1";
    }



}
