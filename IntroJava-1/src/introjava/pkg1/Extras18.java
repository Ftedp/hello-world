/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int n,suma=0;
        System.out.println("Ingrese el tamaño del vector");
        n = read.nextInt();
        int [] numeros= new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor de la posicion"+i);
            numeros[i]=read.nextInt();
            suma+=numeros[i];
        }
        System.out.println(suma);
        
               
    }
    
}
