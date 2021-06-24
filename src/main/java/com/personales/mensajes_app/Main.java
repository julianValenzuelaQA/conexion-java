/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personales.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author joval
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("hola mundo");
        
        Conecion conexion = new Conecion();
        
        try(Connection cnx = conexion.get_connection() ){
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
