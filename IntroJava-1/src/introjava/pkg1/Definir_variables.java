/*
 * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 * and open the template in the editor.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Definir_variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        boolean booleano;
        
        System.out.println("Que numero es más grande? 1)-10, 2)-9, 3)-5");
        
        char unicode = (char) leer.nextFloat();
        
        System.out.println("Escriba la letra Pi con dos decimales");
        double real = leer.nextDouble();
        
        System.out.println("True or False- Es el cielo Celeste?");
        boolean bandera = leer.nextBoolean();
        
        System.out.println("Tus respuestas fueron: " + unicode + " " + real + " " + bandera);
        
        
    }
    
}
