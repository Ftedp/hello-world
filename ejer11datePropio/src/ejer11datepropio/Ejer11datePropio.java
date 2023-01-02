/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11datepropio;

import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer11datePropio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        
        int dia,mes,anio;
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia");
        dia=read.nextInt();
        System.out.println("Mes");
        mes=read.nextInt();
        System.out.println("Año");
        anio=read.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        Date fechaActual = new Date();
        
        System.out.println("Fecha de nacimiento:  "+fecha);
        System.out.println("Fecha actual: "+fechaActual);
        
        int edad = (fechaActual.getYear()) - (fecha.getYear());
        
        System.out.println("Tu edad es: " + edad);
        
        
    }
    
}
