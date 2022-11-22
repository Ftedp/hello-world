/*
 * Fibonacci
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese el numero de n");
        int a, b=1, f=0;
        int n=read.nextInt();
        int [] vector= new int [n];
        for (int i = 0; i < n; i++) {
            a=f;
            f=b+f;
            b=a;
            System.out.println(b+", ");
            
        }
    }
    
}
