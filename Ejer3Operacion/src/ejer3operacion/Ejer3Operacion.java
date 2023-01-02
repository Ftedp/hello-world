/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3operacion;

import OperacionEntidades.Operacion;
import OperacionServicios.OperacionServicios;

/**
 *
 * @author Facundo
 */
public class Ejer3Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicios service = new OperacionServicios();
        Operacion o1=service.crearOperacion(); 
        
        int Sumar = service.Sumar(o1.getN1(),o1.getN2());
        System.out.println("La suma de los numeros es " + Sumar);
        service.Restar(o1.getN1(),o1.getN2());
        
        service.Multiplicacion(o1.getN1(), o1.getN2());
        
        service.Division(o1.getN1(), o1.getN2());
        
    }
    
}
