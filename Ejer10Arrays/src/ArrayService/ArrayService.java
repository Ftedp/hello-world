/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayService;

import ArrayEntidad.Objeto;
import static java.awt.PageAttributes.MediaType.A;
import java.util.Arrays;


/**
 *
 * @author Facundo
 */
public class ArrayService {
    
    public double[] crearArregloA(){
        
        double [] arrAux= new double[50];
        for (int i = 0; i < 50; i++) {
            arrAux[i]=Math.random()*10;
        }
        System.out.println("Vector A desordenado: ");
        
        for (int i = 0; i < 50; i++) {
            System.out.println(arrAux[i] + ", ");
        }
        Arrays.sort(arrAux);
   
        return arrAux;
    }
    public double[] llenarArregloB(double [] arreglo){
        double [] arrAux= new double[20];
        Arrays.fill(arrAux, 10, 20, 0.5);
        System.arraycopy(arreglo, 0, arrAux, 0, 10);
        
        return arrAux;
    }
}
