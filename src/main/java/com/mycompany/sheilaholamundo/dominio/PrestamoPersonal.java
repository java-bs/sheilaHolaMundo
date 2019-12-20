/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sheilaholamundo.dominio;

import java.math.BigDecimal;

/**
 *
 * @author baron1319
 */
public class PrestamoPersonal extends Prestamo{
    
    public PrestamoPersonal(BigDecimal monto, Integer cuotas) {
        super(monto, cuotas);
    }

    @Override
    public void imprimorDatos() {
        System.out.println("Prestamo Personal"
        + "\nMonto: "  + this.getMonto()
        + "\nCuotas: " + this.getCantidadCuotas()
        + "\nImprimir en "+ COLORPRINCIPAL 
        + "\nFecha de Acreditacion: " + this.getFechaAcreditación());
    }
    
}
