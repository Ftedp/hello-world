/*
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int total, numero, valMax=0, valMin=10, promedio=0;
        System.out.println("Cantidad total");
        total = read.nextInt();
        int [] vector = new int [total];
        
 //       for (int i = 0; i < total; i++) {
 //           System.out.println("Ingrese el numero");
  //          numero=read.nextInt();
 //           while
   //                 (numero<0){
     //           System.out.println("Ingrese un numero valido");
       //     numero=read.nextInt();
         //   }
           // vector[i]=numero;
        //}
        for (int i = 0; i < total; i++) {
            do {
                System.out.println("Ingrese un numero para la posicion"+i);
                numero=read.nextInt();
            } while (numero<0);
            vector[i]=numero;   
        }
        
        for (int i = 0; i < total; i++) {
           System.out.print(" ["+vector[i]+"],");
        }
        System.out.println("");
        for (int i = 0; i < total; i++) {
            if (vector[i]>valMax){
                valMax=vector[i];
            }
            if (vector[i]<valMin){
                valMin=vector[i];
            }
            promedio+=vector[i];
        }
        System.out.println("El valor Máximo encontrado es: "+valMax+"\n"
        + "El valor Mínimo encontrado es: "+valMin+"\n"
        + "El promedio de todos los valores es: "+promedio/total);
    }
    
}
