/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2circunferencia;

import CircunferenciaObjeto.Circunferencia;
import CircunferenciaServicios.CircunferenciaServicios;



/**
 *
 * @author Facundo
 */
public class Ejer2Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicios service = new CircunferenciaServicios();
        Circunferencia c1 = service.crearCircunferencia(); 
        
        service.area(c1);
        
        service.perimetro(c1);
    }
    
}
