/*
 *Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos)
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
       
        int n;
        System.out.println("Ingrese el valor del vector");
        n=read.nextInt();
        double [] vector1= new double[n];
        double [] vector2= new double[n];
        
        for (int i = 0; i < n; i++) {
            vector1[i]=Math.random()*10;
            vector2[i]=Math.random()*10;
        }
        for (int i = 0; i < n; i++) {
            if (vector1[i]!=vector2[i]){
                System.out.println("No son iguales");
                break;
            }
        }
    }
    
}
