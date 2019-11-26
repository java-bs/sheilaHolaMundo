/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sheilaholamundo.dominio;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author baron1319
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private BigDecimal ingreso;
    private DocumentoDigital dniDigital;
    private List<Prestamo> prestamos;
    
    
    public void cambiarDomicilio (Domicilio nuevoDomicilio){
        setDomicilio(nuevoDomicilio);
    }
    public void actualizarIngresos(DocumentoDigital recibo, BigDecimal monto){
        setIngreso(monto);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public BigDecimal getIngreso() {
        return ingreso;
    }

    public void setIngreso(BigDecimal ingrso) {
        this.ingreso = ingrso;
    }

    public DocumentoDigital getDniDigital() {
        return dniDigital;
    }

    public void setDniDigital(DocumentoDigital dniDigital) {
        this.dniDigital = dniDigital;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
}
