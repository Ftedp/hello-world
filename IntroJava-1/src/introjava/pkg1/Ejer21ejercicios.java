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
public class Ejer21ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numRandom = new Random();
        int [][] matrizA = new int [10][10];
        int [][] matrizB = new int [3][3];
        int contador=0;
        int acrecentaJ=0;
        int acrecentaI=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            matrizA [i][j]=numRandom.nextInt(20);
            }
        }    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            matrizB [i][j]=numRandom.nextInt(20);
            }
        }
  
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" ["+matrizA [i][j]+"]");
            }
            System.out.println("");
        }    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" ["+matrizB[i][j]+"]");
            }
            System.out.println("");
        }     
        System.out.println("");

        for (int a = 0; a < 7; a++) {
            for (int b = 0; b < 7; b++) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++){
                        if (matrizB [i][j] == matrizA[i+a][j+b]){
                            contador+=1;            
                        }
                        
                    }
                }
                System.out.println("Coincidencias:"+contador);
                contador=0;
            }
        }
        if (contador==9){
            System.out.println("Encontramos la matriz");
        }else {
            System.out.println("No encontramos la matriz");
        }
    }   
}

