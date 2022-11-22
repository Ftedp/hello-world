
import java.util.Scanner;

/*
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
package introjava.pkg1;

/**
 *
 * @author Facundo
 */
public class Extras4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Ingrese un numero del 1 al 10");
            num=read.nextInt();
        } while (num<1 || num>10);
        switch (num) {
            case 10:
                System.out.println("X");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 8:
                System.out.println("IIX");
                break;
            case 7:
                System.out.println("IIIX");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 5:
                System.out.println("V");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 3:
                System.out.println("III");
                break;
            case 2:
                System.out.println("II");
                break;
            default:
                System.out.println("I");
                break;
        }
    }
    
}
