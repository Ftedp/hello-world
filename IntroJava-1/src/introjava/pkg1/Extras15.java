/*
 *  Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main
 */
package introjava.pkg1;
import java.util.Scanner;
/**
 *
 * @author Facundo
 */
public class Extras15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        String opcion;
        System.out.println("Que operacion desea realizar?\n"
                + "Suma: S\n"
                + "Resta: R\n"
                + "Multiplicacion: M\n"
                + "Division: D\n");
        
                opcion=read.next();
        
        switch (opcion){
            case "S":
                System.out.println(Suma(num1,num2));
                break;
            case "R":
                System.out.println(Resta(num1,num2));
                break;
            case "M":
                System.out.println(Multiplicacion(num1,num2));
                break;
            case "D":
                double numero1 = Double.valueOf(num1);
                double numero2= Double.valueOf(num2);
                System.out.println(Division(numero1,numero2));
                break;
        }
    }
    public static int Suma(int a, int b){
        int c=a+b;
        return c;
    }
    public static int Resta(int a,int b){
        int c=a-b;
        return c;
    }
    public static int Multiplicacion(int a, int b){
        int c = a * b;
        return c;
    }
    public static double Division(double a, double b){
        double c = a/b;
        return c;
    }
}
