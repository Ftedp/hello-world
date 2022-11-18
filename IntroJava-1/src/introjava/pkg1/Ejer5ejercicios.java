/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package introjava.pkg1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer5ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero por teclado");
        double numero = leer.nextDouble();
       
                
        MostrarPorPantalla(numero);
    }
    public static void MostrarPorPantalla(Double numero){
        System.out.println("El doble de " +numero+ " es "+numero*2);
        System.out.println("El triple de " +numero+ " es "+ numero*3);
        System.out.println("La raíz cuadrada de "+numero+" es "+Math.sqrt(numero));
    }
}
