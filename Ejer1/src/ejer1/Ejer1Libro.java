/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import LibroServicio.LibroServicio;
import entidades.Libro;

/**
 *
 * @author Facundo
 */
public class Ejer1Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroServicio ls = new LibroServicio();
        Libro L1 = ls.LibroServicio();
        System.out.println(L1.toString());
    }
    
}
