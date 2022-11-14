/*
 *Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer1Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if ((num1 > 25)||(num2 > 25)){
        System.out.println("Al menos 1 de los numeros es mayor que 25");
        
    }else {
            System.out.println("Ninguno de los numeros es mayor que 25");
            }
        
    }
    
}
