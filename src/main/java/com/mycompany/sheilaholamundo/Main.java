/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sheilaholamundo;

import com.mycompany.sheilaholamundo.dominio.Banco;
import com.mycompany.sheilaholamundo.dominio.Cliente;
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
        
        
     
        Banco.obtener("Banco Saenz 277");
        System.out.println("Imprimo Banco Sanez: " + Banco.bancoToString());
       
        Banco.obtener("Banco itau 052");
        System.out.println("Imprimo Banco Itau: " + Banco.bancoToString());
        
        Prestamo p = new Prestamo(new BigDecimal(1000000),12);
        p.setTasa(new BigDecimal(30.45));
        p.setPlazoEnMeses(5);
        Cliente c1 = new Cliente("Sheila","Baron","321654987");
        c1.agregarPrestamo(p);
        
        System.out.println("\n***Cliente***\n" + c1.toString());
        System.out.println("***Prestamo***\n" + c1.getPrestamos().get(0).toString());
        
        
        
        
    }
    private static String getTexto(){
    return Main.texto;
    }
    private static void setTexto(String s){
    Main.texto =  s;
    }

    
}
