/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sheilaholamundo.dominio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baron1319
 */
public class Cliente implements ImprimirDatos{
    private String dni;
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private BigDecimal ingreso;
    private DocumentoDigital dniDigital;
    private List<Prestamo> prestamos;
    
    public void agregarPrestamo(Prestamo p){
    this.prestamos.add(p);
    }
    public String toString(){
    String s;
        s = "Nombre: " + this.nombre;
        s += "\nApellido; "+ this.apellido;
        s += "\nDNI; "+ this.dni;
        return s;
    }
    public Cliente(String nombre, String apellido, String dni){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestamos = new ArrayList<Prestamo>();
    }
    public void cambiarDomicilio (Domicilio nuevoDomicilio){
        setDomicilio(nuevoDomicilio);
    }
    
    @Override
    public void imprimorDatos() {
        String s;
        s = "Nombre: " + this.nombre;
        s += "\nApellido; "+ this.apellido;
        s += "\nDNI; "+ this.dni;
        System.out.println(s+"\nLos Prestamos");
        for(Prestamo prestamo : this.prestamos  ){
            prestamo.imprimorDatos();
        }
        
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
