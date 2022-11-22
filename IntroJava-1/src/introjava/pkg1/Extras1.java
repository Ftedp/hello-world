/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int minutos = leer.nextInt();
        int horas=0,dias=0;
        for (int i = 0; i < minutos; i+=60) {
            horas+=1;
            if (horas==24){
                dias+=1;
                horas=0;
            }
        }

        System.out.println(minutos+" minutos son equivalentes a "+dias+" dias y "
                +horas+" horas");
    }
    
}
