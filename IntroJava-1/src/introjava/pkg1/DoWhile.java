/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero =0;
        System.out.println("Intente adivinar el numero escogido");
                           
        do {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            contador +=1;
            suma += numero;
            if (contador >=20){
                System.out.println("Te has pasado de la cantidad de intentos");
            }
                if (numero == 0){
                System.out.println("Has encontrado nuestro numero");
            break;}
        } while ((numero !=0 || contador<=20));
        

        System.out.println("La cantidad de numeros ingresados es: " +contador+
                ", la suma de esos numeros es: "+suma);   
    }
}


