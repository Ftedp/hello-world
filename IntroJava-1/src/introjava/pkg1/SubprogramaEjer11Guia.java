/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.pkg1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author Facundo
 */
public class SubprogramaEjer11Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String retorno = transcripcion(frase);
        System.out.println(retorno);
    }

    private static String transcripcion(String frase) {
        String transcripcion = null;
        int largo= frase.length();
        for (int i = 0; i < largo; i++) {
        substring(frase,0,largo);
              
          
        }
        
        return transcripcion;
}
}
