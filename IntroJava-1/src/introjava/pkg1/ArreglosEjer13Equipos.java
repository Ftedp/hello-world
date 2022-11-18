/*
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ArreglosEjer13Equipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Cuantos participantes hay en su equipo?");
        int companeros = read.nextInt();
        String [] vectorEquipo = new String[companeros];
       
        for (int i = 0; i < companeros; i++) {
            System.out.println("Ingrese el nombre de cada uno de los participantes:");
            System.out.println(companeros - i + " restantes...");
            vectorEquipo [i]= read.next();
        }
        System.out.println("Participantes: ");
         for (int i = 0; i < companeros; i++) {
            System.out.println("["+i+"]"+vectorEquipo [i]+", ");
            
        }
    }
    
}
