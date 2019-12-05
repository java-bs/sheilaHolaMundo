/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sheilaholamundo.dominio;

/**
 *
 * @author baron1319
 */
public class Banco {
    
    private final String codigo;
    public static Banco instance = null;
    private Banco(String codigo){ this.codigo = codigo;}
    
    /**
     *
     * @param codigo
     * @return
     */
    public static Banco obtener(String codigo){
        if(instance == null){
            return instance = new Banco(codigo);
        }else{
            return instance;
        }
    }
    public static String bancoToString(){
    return "Banco codigo: "+instance.codigo;
    }
    
    public String getCogigo(){
        return this.codigo;
    }
}
