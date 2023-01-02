/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10arrays;

import ArrayEntidad.Objeto;
import ArrayService.ArrayService;
import java.util.Arrays;

/**
 *
 * @author Facundo
 */
public class Ejer10Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayService as=new ArrayService();
        
        Objeto arreglo1 = new Objeto();
        arreglo1.setA(as.crearArregloA());
        double [] arrAux = new double[50];
        
        System.arraycopy(arreglo1.getA(), 0, arrAux, 0, 50);
            
        arreglo1.setB(as.llenarArregloB(arrAux));
        
        System.out.println("Vector B: ");
        System.out.println(Arrays.toString(arreglo1.getB()));
        System.out.println("Vector A: ");
        System.out.println(Arrays.toString(arreglo1.getA()));
       
        
    }
    
}
