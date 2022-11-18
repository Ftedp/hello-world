/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.pkg1;


import java.util.Random;

/**
 *
 * @author Facundo
 */
public class Ejer17ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digito1=0, digito2=0, digito3=0, digito4=0, digito5=0;
        Random numRandom = new Random();
        int [] vector = new int [10];
        for (int i = 0; i < 10; i++) {
            vector [i]=numRandom.nextInt(99999);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("["+vector[i]+"]");
        }
        for (int i = 0; i < 10; i++) {
            String cadena = String.valueOf(vector[i]);
            int largo = cadena.length();
            switch (largo) {
                case 1:
                    digito1+=1;
                    break;
                case 2:
                    digito2+=1;
                    break;
                case 3:
                    digito3+=1;
                    break;
                case 4:
                    digito4+=1;
                    break;
                case 5:
                    digito5+=1;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Cantidad de numeros por digito:\n"
                + "1 Digito"+digito1+"\n"
                + "2 Digitos"+digito2+"\n"
                + "3 Digitos"+digito3+"\n"
                + "4 Digitos"+digito4+"\n"
                + "5 Digitos"+digito5);
    }
    
}
