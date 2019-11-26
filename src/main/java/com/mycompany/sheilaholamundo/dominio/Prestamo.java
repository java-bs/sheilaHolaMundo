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
    private BigDecimal monto;
    private Integer plazoEnMeses;
    private Integer cantidadCuotas;
    private BigDecimal tasa;
    private List<DocumentoDigital> documentos;
    
    
    
    public Boolean cancelaCuotas(Integer Cantidad){
        return true;
    }
    public void cancelarPrestamo(){
    
    }
}
