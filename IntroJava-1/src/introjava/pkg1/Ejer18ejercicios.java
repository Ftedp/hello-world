/*
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package introjava.pkg1;

import java.util.Random;

/**
 *
 * @author Facundo
 */
public class Ejer18ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        Random numRandom = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=numRandom.nextInt(20);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" ["+matriz[i][j]+"]");
            }
            System.out.println(" ");

        }
        System.out.println("\n"
                + "\n");
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(" ["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
    
}
