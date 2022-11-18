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
public class Ejer11ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        String salirDelPrograma="";
        System.out.println("Ingrese dos numeros por teclado");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        do {System.out.println("Elija una opción\n"
                +"Opciones:\n"
                + "1.Sumar:\n"
                + "2.Restar:\n"
                + "3.Multiplicar:\n"
                + "4.Dividir:\n"
                + "5.Salir:\n");
        opc = leer.nextInt();
        switch(opc){
            case 1:
                System.out.println(num1+num2+"\n");
                break;
            case 2:
                System.out.println(num1-num2+"\n");
                break;
            case 3:
                System.out.println(num1*num2+"\n");
                break;
            case 4:
                System.out.println(num1/num2+"\n");
                break;
            case 5:System.out.println("Seguro que desea salir del programa? S/N");
             salirDelPrograma = leer.next();
            if (salirDelPrograma.equalsIgnoreCase("S")) {
               System.out.println("Saliendo Del Programa");
               break;
           }else{
               System.out.println("Volviendo al menu inicial");
               break;
           }
            default : 
                System.out.println("Elija una opción valida");
        }
            
        } while (!"S".equalsIgnoreCase(salirDelPrograma));
        
    }
    
}
