/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        for (int c = 0; c < 4; c++) {
            System.out.println("");
            System.out.println("Ingrese un digito");
            int numero = leer.nextInt();
            System.out.println(numero + ":");
            for (int i = 0; i<numero; i++) {
                System.out.print("*");
            }
        }
        
    }
    
}
