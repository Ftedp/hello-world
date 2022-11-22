/*
 * Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int dividendo=0, divisor=0, residuo=0, cociente=1;
        System.out.println("Ingrese 2 numeros enteros mayores que 1");
        do {
            dividendo=read.nextInt();
            divisor=read.nextInt();
        } while (dividendo<1 && divisor<1);
        
        System.out.println(dividendo+"/"+divisor+"=");
        
        while (dividendo-(divisor*cociente)>divisor){
            cociente+=1;
        }
        residuo=dividendo-divisor;
        while (residuo>divisor){
            residuo=residuo-divisor;
        }
  
        System.out.println("Cociente: "+cociente+"\n"
        + "Resudio: "+ residuo);
//              50(dividendo) - 13(divisor) = 37(residuo) 
//		37(residuo) - 13(divisor) = 24(residuo) 
//		24 - 13 = 11
    }
    
}
