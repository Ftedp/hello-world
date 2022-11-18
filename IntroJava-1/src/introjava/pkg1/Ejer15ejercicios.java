/*
 *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package introjava.pkg1;



/**
 *
 * @author Facundo
 */
public class Ejer15ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [] vector;
        //vector = new int [100]; 
        int [] vector = new int [100];
        
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.print(" ["+vector[i]+"]");
        }
       
    }
    
}
