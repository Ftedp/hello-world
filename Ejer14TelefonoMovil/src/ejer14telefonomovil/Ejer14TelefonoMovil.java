/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer14telefonomovil;

import Movil.Movil;
import ServiceMovil.ServiceMovil;

/**
 *
 * @author Facundo
 */
public class Ejer14TelefonoMovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceMovil sc = new ServiceMovil();
        Movil m1=sc.cargarCelular();
        
        System.out.println(m1.toString());
    }
    
}
