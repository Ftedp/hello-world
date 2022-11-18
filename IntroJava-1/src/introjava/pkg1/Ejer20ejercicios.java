/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer20ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int test = 0;
        int sumafila=0;
        int sumacolumna=0;
        int sumadiagonal=0, sumadiagonalinvert=0;
        
////Crear un programa que permita introducir un cuadrado por teclado y determine 
///si este cuadrado es mágico o no. El programa deberá comprobar que los números 
///introducidos son correctos, es decir, están entre el 1 y el 9.
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Introduzca un valor entre 1-9, sin repetir, para la posicion ["+i+"]["+j+"]");
                    test = leer.nextInt();
                } while ((test<1) || (test>9));
                    matriz[i][j] = test;
            }
        }        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" ["+matriz[i][j]+"]");  
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumafila+=matriz[i][j];  
            }
            System.out.println("La suma de la fila "+i+" es "+ sumafila);
            sumafila=0;
        }      
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumacolumna+=matriz[i][j];  
            }
            System.out.println("La suma de la columna "+j+" es "+ sumacolumna);
            sumacolumna=0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j){
                    sumadiagonal+=matriz[i][j];  
                }
            }
        }
                    System.out.println("La suma de la diagonal es "+ sumadiagonal);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j){
                    sumadiagonalinvert+=matriz[i][3-(1+i)];  
                }
            }
        }            
        System.out.println("La suma de la diagonal invertida es "+ sumadiagonalinvert);
        if (sumafila==sumacolumna && sumadiagonal==sumadiagonalinvert && sumafila==sumadiagonal){
            System.out.println("El cuadrado es Mágico!");
        }else{
            System.out.println("El cuadrado nunca iba a ser magico prrrro");
        }
        
    }
}