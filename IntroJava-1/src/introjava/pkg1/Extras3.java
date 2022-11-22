/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        String letter;
        do {
            System.out.println("Ingrese una letra");
            letter = leer.nextLine();
            if (letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")){
                System.out.println("Es una vocal");
            }else{
                System.out.println("No es una vocal");
            }
        } while (!letter.equals("salir"));
                
    }
    
}
