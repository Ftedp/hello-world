

package introjava.pkg1;
import java.util.Scanner;

/*
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
package introjava.pkg1;

/**
 *
 * @author Facundo
 */
public class MultiplosEjer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese sus numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        Multiplos(num1, num2);
       
        
    }
   public static void Multiplos(int num1, int num2){
       if (num1%num2==0) {
           System.out.println(num1 + " es multiplo de " + num2);
       }else{
           System.out.println(num1 + " no es multiplo de " + num2);
       }
   }
}
