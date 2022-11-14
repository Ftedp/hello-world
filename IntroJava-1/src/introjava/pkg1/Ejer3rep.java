/*
 * Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
 */
package introjava.pkg1;

/**
 *
 * @author Facundo
 */
public class Ejer3rep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, suma;
        boolean booleano;
        num1 = 5;
        num2 = 3;
        suma = num1 + num2;
        System.out.println("suma= " + suma);
        suma = num1 - num2;
        System.out.println("resta= " + suma);
        booleano = num1 > num2;
        System.out.println(num1 + ">" + num2 + ":" + booleano);
        booleano = num1 == num2;
        System.out.println(num1 + "=" + num2 + ":" + booleano);
    }
    
}
