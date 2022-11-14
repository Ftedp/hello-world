/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class NotasWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese la nota");
        nota = leer.nextInt();
        while ((nota <=1) || (nota >=10)){
            System.out.println("Ingrese una nota correcta");
            nota = leer.nextInt();
        }
        System.out.println("La nota "+nota+" es valida");
    }
        
            
}
