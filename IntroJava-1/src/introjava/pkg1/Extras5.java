/*
 * o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package introjava.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int costo;
        Random num = new Random();
        double monto = num.nextInt(10000);
        
        String categoria;
        System.out.println("Costo: $"+monto);
        do {
            System.out.println("Categoría de socio:\n"
            + "-A\n"
            + "-B\n"
            + "-C\n");
        categoria = read.nextLine();
        if (categoria.equals("A")){
            break;
        }else if (categoria.equals("B")){
            break;
        }
        } while (!"C".equals(categoria));
        
        switch (categoria){
            case "A":
                System.out.println("El monto a abonar es $"+(monto*0.50));
                break;
            case "B":
                System.out.println("El monto a abonar es $"+(monto*.35));
                break;
            case "C":
                System.out.println("El monto a abonar es $"+monto);
                break;
        }
            System.out.println("Gracias por ser parte de Java Seguros Dental");
        
    }
    
}
