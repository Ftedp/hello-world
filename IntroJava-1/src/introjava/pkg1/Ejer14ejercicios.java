/*
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer14ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dinero=0;

        Cambio();         
    }
    public static double Cambio(){
        Scanner leer = new Scanner(System.in);
        double resultado=0;
        double libras = 0.86;
        double dolar = 1.28611;
        double yenes = 129.852;
        double cantidad;
        int opc;
        System.out.println("Que moneda desea comprar:\n"
                + "1.Libras:\n"
                + "2.Dolar:\n"
                + "3.Yenes");
        opc= leer.nextInt();
        System.out.println("Que cantidad de Euros desea gastar?");
        cantidad=leer.nextDouble();
        switch (opc){
            case 1: System.out.println(cantidad*libras);
                break;
            case 2: System.out.println(cantidad*dolar);   
                break;
            case 3:System.out.println(cantidad*yenes);
        }
                
        return resultado;
    }
}
