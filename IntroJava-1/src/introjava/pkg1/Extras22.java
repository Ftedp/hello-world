/*
 * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int n, m;
        double suma=0;
        System.out.println("Ingrese el valor de N y M");
        n=read.nextInt();
        m=read.nextInt();
        double [][]matriz= new double [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=Math.random()*10;
                suma+=matriz[i][j];
            }
        }
        System.out.println("La suma es "+ suma);
    }
    
}
