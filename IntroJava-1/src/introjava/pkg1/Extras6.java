/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package introjava.pkg1;



import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Personas:");
        int personas = read.nextInt();
        int promedioMenor=0, promedioMayor=0;
        float [] alturas = new float[personas];
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de "+i+"\n");
            alturas [i] = read.nextFloat();
        }
        for (int i = 0; i < personas; i++) {
            if (alturas[i] <= 1.60){
            promedioMenor+=1;
            }
        }
        for (int i = 0; i < personas; i++) {
            promedioMayor+=alturas[i];
        }
        System.out.println("El promedio de altura");
    }
    
}
