package com.programers.Ciclo03Programers.model;

public class MovimientoDinero {
    private double montoMovimiento;
    private String conceptoMovimiento;
    private String usuarioEncargado;

    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento, String usuarioEncargado) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioEncargado = usuarioEncargado;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioEncargado() {
        return usuarioEncargado;
    }

    public void setUsuarioEncargado(String usuarioEncargado) {
        this.usuarioEncargado = usuarioEncargado;
    }

    public double monto(){
        return -1;
    }
    public String UsuarioEncargado(){
        return "-1";
    }

}
