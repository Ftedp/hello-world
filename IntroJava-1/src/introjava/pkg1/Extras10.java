/*
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1 =(int) (Math.random()*10);
        int num2 =(int) (Math.random()*10);
        int guest;
        int resultado= num1*num2;
        System.out.println("Intente adivinar el resultado");
        System.out.println(resultado);
        do {
            guest=read.nextInt();
            if (guest==resultado){
                System.out.println("Adivinaste!");
                break;
            }else{
                System.out.println("Siga intentando");
            }
        } while (guest!=resultado);
        
    }   
    
}
