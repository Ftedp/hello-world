/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String opc, nombre;
        int edad;
        do {
            System.out.println("Ingrese el nombre de la persona");
            nombre=read.next();
            System.out.println("Ingrese la edad de "+nombre);
            edad=read.nextInt();
            if (edad>=18){
                System.out.println(nombre+" tiene "+edad+" años y es mayor de edad");
            }else{
                System.out.println(nombre+" tiene "+edad+" años y es menor de edad");
            }
            System.out.println("Desea seguir mostrando personas?Si/No");
            opc=read.next();
        } while (!"No".equalsIgnoreCase(opc));
        
    }
    
}
