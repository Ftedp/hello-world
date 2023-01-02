/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircunferenciaServicios;

import CircunferenciaObjeto.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class CircunferenciaServicios {

    
    public Circunferencia crearCircunferencia(){
        Scanner read = new Scanner(System.in);
          
        System.out.println("Ingrese el radio del circulo");
        
        return new Circunferencia(read.nextFloat());
    }
    
    public void area(Circunferencia c1){
        System.out.println("El area del circulo es " + Math.PI*c1.getRadio()*c1.getRadio());
    }
    
    public void perimetro(Circunferencia c1){
        System.out.println("El perimetro es "+ 2*Math.PI*c1.getRadio());
    }
    
}
