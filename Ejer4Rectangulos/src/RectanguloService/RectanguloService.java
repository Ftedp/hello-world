/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectanguloService;

import RectanguloEntidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class RectanguloService {
    Scanner read = new Scanner(System.in);
    
    public Rectangulo creaRectangulo(){
        System.out.println("Ingrese la base y la altura del rectangulo");
        
        return new Rectangulo(read.nextInt(),read.nextInt());
    }
    public void superficieRectangulo(int base, int altura){
        System.out.println("La superficie del rectangulo es "+ base * altura);
    }
    public void perimetroRectangulo(int base, int altura){
        System.out.println("El perimetro del rectangulo es "+ (base+altura)*2);
    }
    public void dibujaRectangulo(int base, int altura){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");           
        }
    }
}
