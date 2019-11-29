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
public class Prestamo {
    private final BigDecimal monto;
    private Integer plazoEnMeses;
    private Integer cantidadCuotas;
    private BigDecimal tasa;
    private List<DocumentoDigital> documentos;
    
    public Prestamo(BigDecimal monto,Integer cuotas){
        this.monto = monto;
        this.cantidadCuotas = cuotas;
    }
    public String toString(){
        String s;
        s = "Monto; "+ this.monto;
        s += "\nCantidad de cuaotas; "+ this.cantidadCuotas;
        s += "\nTasa; "+ this.tasa;

        return s;
    }
    public Boolean cancelaCuotas(Integer Cantidad){
        return true;
    }
    public void cancelarPrestamo(){
    }

    public BigDecimal getMonto() {
        return monto;
    }



    public Integer getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(Integer plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public List<DocumentoDigital> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentoDigital> documentos) {
        this.documentos = documentos;
    }
    
}
