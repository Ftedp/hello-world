/*
 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
primo, sino false
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        double numero;
        System.out.println("Ingrese un numero");
        numero=read.nextDouble();
        System.out.println("Es"+numero+" un numero primo?");
        System.out.println(Primo(numero));
    }
    public static boolean Primo(double num){
        boolean resultado=true;
        int contador=0;
        for (int i = 1; i < num+1; i++) {
            if (num%i==0){
                contador+=1;
            }
            if (contador>2){
                resultado= false;
                break;
            }
        }
        return resultado;
    }
}
