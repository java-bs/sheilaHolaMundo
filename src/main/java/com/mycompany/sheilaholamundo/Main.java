/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sheilaholamundo;

import com.mycompany.sheilaholamundo.dominio.Banco;
import com.mycompany.sheilaholamundo.dominio.Cliente;
import com.mycompany.sheilaholamundo.dominio.PrestamoPersonal;
import com.mycompany.sheilaholamundo.dominio.PrestamoPrendario;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 * @author baron1319
 */
@SpringBootApplication
public class Main {
    public static void main(String[] parametros) {
    
        SpringApplication.run(Main.class, parametros);

        String texto;
   
        // TODO code application logic here
        texto = "Mundo, Hola!!!!";
        System.out.println(texto);
        
        
     
        Banco saenz = Banco.obtener("Banco Saenz 277");
        System.out.println("Imprimo Banco Sanez: " + saenz.bancoToString());
       
        Banco itau = Banco.obtener("Banco itau 052");
        System.out.println("Imprimo Banco Itau: " + itau.bancoToString());
        
        PrestamoPersonal p = new PrestamoPersonal(new BigDecimal(1000000),12);
        p.setTasa(new BigDecimal(30.45));
        p.setPlazoEnMeses(5);
        p.setFechaAcreditacion( LocalDate.of(2019,3,16) );
        Cliente c1 = new Cliente("Sheila","Baron","321654987");
        c1.agregarPrestamo(p);
        PrestamoPrendario pp = new PrestamoPrendario(new BigDecimal(30000), 6);
        pp.setFechaAcreditacion( LocalDate.of(2018,3,16) );
        c1.agregarPrestamo(pp);
        pp.setTasa(new BigDecimal(0.335));
        
        System.out.println("\n***Cliente***\n" + c1.toString());
        System.out.println("***Prestamo***\n" + c1.getPrestamos().get(0).toString());
        c1.imprimorDatos();
        
        
        
        
    }
   

    
}
