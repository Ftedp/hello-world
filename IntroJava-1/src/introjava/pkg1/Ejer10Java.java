/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.pkg1;

import java.util.Scanner;
/**
 *
 * @author Facundo
 */
public class Ejer10Java {
    
    /*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número limite");
        int num = leer.nextInt();
        int cont = 0;
        
        do {            
            System.out.println("Ingrese un número");
            cont=cont+leer.nextInt();
            System.out.println("La suma de los números es: "+cont);
        } while (cont<num);
        
    }
}
