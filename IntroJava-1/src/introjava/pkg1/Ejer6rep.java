/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package introjava.pkg1;

import java.util.Scanner;


/**
 *
 * @author Facundo
 */
public class Ejer6rep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba un numero");
        
        int num = leer.nextInt();
        
        if (num%2==0){
            System.out.println("El numero es par");
        }else{System.out.println("El numero es impar");      
        }
}
}
