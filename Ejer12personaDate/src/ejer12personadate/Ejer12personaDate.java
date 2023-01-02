/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12personadate;

import PersonaDateEntidad.Entidades;
import ServicePersona.Service;

/**
 *
 * @author Facundo
 */
public class Ejer12personaDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Service sc = new Service();
        Entidades p1;
        p1 = sc.crearPersona();
        
        
        int edad = sc.calcularEdad(p1);
        
        boolean buleano = sc.menorQue(edad);
        
        
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Fecha de nacimiento: "+p1.getNacimiento());
        System.out.println("Edad " + edad);
        System.out.println("Es el segundo usuario menor que el primero? " + buleano);
    }
    
}
