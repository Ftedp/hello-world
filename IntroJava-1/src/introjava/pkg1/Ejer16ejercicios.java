/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer16ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        Funcion(n);
        
    }
    public static void Funcion(int n){
        Scanner leer = new Scanner(System.in);
        double valor;
        int cont = 0;
        double [] vector = new double [n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=Math.round(Math.random()*10);
        }

       
        System.out.println("Que valor desea buscar");
        valor = leer.nextDouble();
        
            for (int i = 0; i < n; i++) {
                if (valor==vector[i]){
                    System.out.println("["+vector[i]+"]");
                    cont+=1;
                } 
            }
        
        System.out.println("El numero fue repetido "+cont+" veces");
    }
}
