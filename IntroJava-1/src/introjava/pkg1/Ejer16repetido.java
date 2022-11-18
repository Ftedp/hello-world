/*
 *  Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package introjava.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer16repetido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random numRandom = new Random();
        int numero, cont=0;
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        
        for (int i = 0; i < n; i++) {
            vector [i]=numRandom.nextInt(10);
            System.out.println("["+vector[i]+"]");
        }

        System.out.println("Que numero está buscando?");
        numero = leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (numero==vector[i]){
                cont+=1;
                System.out.println("Posicion:"+i);
            }
        }
        System.out.println("El numero se repite " + cont);
    }
    
}
