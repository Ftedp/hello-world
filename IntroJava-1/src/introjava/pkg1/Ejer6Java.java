/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.pkg1;

import java.util.Scanner;

public class Ejer6Java {
    /*
    Crear un programa que dado un numero determine si es par o impar.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        
        if (num%2==0) {
              System.out.println("Es un número par");
            
        }else{
            System.out.println("Es un número impar");
        }
            
          
    }
}
