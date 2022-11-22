/*
 *Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
1-2
1-2-3
 */
package introjava.pkg1;

import java.util.Scanner;



/**
 *
 * @author Facundo
 */
public class Extras13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int numero = read.nextInt();
        for (int i = 1; i < numero+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println("");
          
        }
        
        
    }
    
}
