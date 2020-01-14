/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sheilaholamundo.controller;

import com.mycompany.sheilaholamundo.dominio.Prestamo;
import com.mycompany.sheilaholamundo.dominio.PrestamoPersonal;
import com.mycompany.sheilaholamundo.dominio.PrestamoPrendario;
import java.math.BigDecimal;
import java.time.LocalDate;
import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author baron1319
 */
@RestController
public class PrestamoController {
 
    @RequestMapping(method = GET, path = "/prestamos")
    public List<Prestamo> obtenerPrestamos() {

        

        BigDecimal elMonto = new BigDecimal("1550.25");
        Prestamo miPrimerPrestamo = new PrestamoPersonal(elMonto,4);
        miPrimerPrestamo.setFechaAcreditacion(LocalDate.of(2019, 10, 20));

        Prestamo miSegundoPrestamo = new PrestamoPersonal( elMonto, 12);

        PrestamoPrendario miPrestamoHipotecario = new PrestamoPrendario(elMonto, 30);
        miPrestamoHipotecario.setFechaAcreditacion(LocalDate.of(2020, 11, 1));

        Prestamo[] prestamosDelCliente = {
            miPrimerPrestamo,
            miSegundoPrestamo,
            miPrestamoHipotecario};
        return asList(prestamosDelCliente);
    }
    
}
