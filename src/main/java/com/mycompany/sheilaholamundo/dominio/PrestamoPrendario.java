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
public class PrestamoPrendario extends Prestamo{
    
    public PrestamoPrendario(BigDecimal monto, Integer cuotas) {
        super(monto, cuotas);
    }
    
}
