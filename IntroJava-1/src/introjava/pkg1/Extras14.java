/*
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int familias, hijos, edad, media=0;
        System.out.println("Ingrese la cantidad de familias");
        familias=read.nextInt();
        System.out.println("A continuacion ingrese la cantidad de hijos");
        hijos=read.nextInt();
        for (int i = 0; i < familias; i++) {
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad");
                edad=read.nextInt();
                media+=edad;
            }
        }
        System.out.println("La media de edad es:"+media/(familias*hijos));
    }
    
}
