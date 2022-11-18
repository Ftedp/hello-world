/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer12ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contcorrecto = 0;
        int contincorrecto = 0;
        String cadena;
       
        do {System.out.println("Ingrese una cadena");
            cadena = leer.next();
            int largo = cadena.length();
            if ((cadena.substring(0,1).equals("X")) && (cadena.endsWith("O")) && (cadena.length()<=5)){
                contcorrecto+=1;
        }else{
                contincorrecto+=1;
            }   
        } while (!cadena.equalsIgnoreCase("&&&&&"));
        
        System.out.println("La cantidad de lecturas correctas es: " + contcorrecto);
        System.out.println("La cantidad de lecturas incorrectas es:" + contincorrecto);
    }
    
}
