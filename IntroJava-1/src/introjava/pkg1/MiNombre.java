/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class MiNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre y tu edad");
        String nombre = leer.next();
        int edad = leer.nextInt();
        System.out.println("Hola, mi nombre es " + nombre + " tengo " + edad + " años");
    }
    
}
