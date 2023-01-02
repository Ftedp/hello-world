/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4rectangulos;

import RectanguloEntidades.Rectangulo;
import RectanguloService.RectanguloService;

/**
 *
 * @author Facundo
 */
public class Ejer4Rectangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RectanguloService service= new RectanguloService();
        Rectangulo r1 = service.creaRectangulo();
        
        service.superficieRectangulo(r1.getBase(), r1.getAltura());
        System.out.println("");
        service.perimetroRectangulo(r1.getBase(), r1.getAltura());
        System.out.println("");
        service.dibujaRectangulo(r1.getBase(), r1.getAltura());
        
    }
    
}
