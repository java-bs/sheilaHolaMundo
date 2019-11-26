/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sheilaholamundo;

import com.mycompany.sheilaholamundo.dominio.Prestamo;
import java.math.BigDecimal;

/**
 *
 * @author baron1319
 */
public class Main {

    static String texto;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        setTexto("Mundo, Hola!!!!");
        System.out.println(getTexto());
        Prestamo p = new Prestamo();
        p.setCantidadCuotas(12);
        p.setMonto(new BigDecimal(1000000));
        p.setTasa(new BigDecimal(30.45));
        p.setPlazoEnMeses(5);
        
        
        
    }
    private static String getTexto(){
    return Main.texto;
    }
    private static void setTexto(String s){
    Main.texto =  s;
    }

    
}
