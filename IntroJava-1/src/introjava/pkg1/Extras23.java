/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String [][] matrizSopaLetras = new String[10][10];
        
        IngresarPalabras(matrizSopaLetras);
        RellenarSopaLetras(matrizSopaLetras);
        IniciarSopaLetras(matrizSopaLetras);
    }
    public static void IngresarPalabras(String [][] matrizSopaLetras){
        Random random = new Random();
        Scanner leer=new Scanner(System.in);        
        String palabra;
        int columna;
        int fila;
        System.out.println("Ingrese 5 palabras entre 3 y 5 caracteres:");
        for (int i = 0; i < 3; i++) {
            System.out.println(i+":");
            palabra=leer.nextLine();
            while ((palabra.length()<2)||(palabra.length()>5)){
                System.out.println("ERROR: Palabra permitida entre 3-5 caracteres");
                System.out.println("Ingresa nuevamente la palabra");
                palabra=leer.nextLine();
            }
            fila=random.nextInt(20);
            columna=random.nextInt(20-palabra.length());
            boolean posicionOcupada=true;
            for (int j = 0; j < palabra.length(); j++) {
                while (matrizSopaLetras[fila][columna] != null && posicionOcupada){
                fila=random.nextInt(20);
                columna=random.nextInt(20-palabra.length());
                }
                posicionOcupada=false;
                matrizSopaLetras[fila][columna+j]= palabra.substring(j, j+1);
            }
        }
    }
    public static void RellenarSopaLetras(String [][] matrizSopaLetras){
        Random random= new Random();
        int numrandom;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matrizSopaLetras[i][j]==null){
                    numrandom=random.nextInt(9);
                    matrizSopaLetras[i][j]=String.valueOf(numrandom);
                }
            }
        }   
    }
    public static void IniciarSopaLetras(String [][] matrizSopaLetras){
        int palabraEncontrada=0;
        boolean banderaPalabraEncontrada;
        System.out.println("Busca las palabras!!!");
        for (int i = 0; i < 5; i++) {
            if (palabraEncontrada==5){
                break;
            }
            MostrarMatriz(matrizSopaLetras);
            banderaPalabraEncontrada=BuscarMatriz(matrizSopaLetras);
            
        }
        if (banderaPalabraEncontrada){
            palabraEncontrada+=1;
            System.out.println("Encontraste una palabra!");
        }else{
            System.out.println("La palabra no estaba ahi");
        }
        if (palabraEncontrada<5){
            System.out.println("No encontraste todas las palabras");
        }else{
            System.out.println("Ganaste, encontraste todas las palabras!!!");
        }
            
    }
    public static void BuscarPalabra(String [][] matrizSopaLetras){
        Scanner leer=new Scanner(System.in);
        System.out.println("Que palabra desea buscar?:");
        String palabra = leer.nextLine();
        System.out.println("Ingrese la fila:");
        int fila=leer.nextInt();
        System.out.println("Ingrese la columna");
        int columna=leer.nextInt();
        int limite=columna+palabra.length();
        int contadorPosicion=0;
        for (int i = columna; i < limite; i++) {
            if (!matrizSopaLetra[fila][i].toLowerCase().equals(palabra.toLowerCase()substring(contadorPosicion, contadorPosicion+1))){
                return false;
            }
             contadorPosicion+=1;
        }
        return true;
    }
    public static void MostrarPalabra(String [][] matrizSopaLetras){
        for (int i = 0; i < 20; i++) {
            System.out.println("[");
            for (int j = 0; j < 19; j++) {
                System.out.println("|");
            }
            System.out.println("]");
        }
    }
}
