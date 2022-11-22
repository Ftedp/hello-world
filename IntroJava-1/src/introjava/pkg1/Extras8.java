/*
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        int numero=0, impar=0, par=0, contador=0;
        
        do {
            System.out.println("Ingrese un numero");
            numero=read.nextInt();
            
            if (numero%2==0){
              par+=1;  
              contador+=1;
            }else {
                impar+=1;
                contador+=1;
            }
        } while (!(numero%5==0));
        System.out.println("La cantidad de numeros leidos es: "+contador+"\n"
                + "La cantidad de numeros pares es "+ par+ "\n"
                + "La cantidad de numeros inmpares es: "+impar);

        
    }
    
}
