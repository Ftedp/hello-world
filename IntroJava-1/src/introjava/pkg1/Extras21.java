/*
 *  Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
    adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
    desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
    prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    1 Primer trabajo práctico evaluativo 10%
    2 Segundo trabajo práctico evaluativo 15%
    3 Primer Integrador 25%   
    4 Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
    programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
    desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
    igual al 7 de sus notas del curso.
 */
package introjava.pkg1;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Extras21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double [][]matriz = new double [10][4];
        double [] vector = new double [10];
        double porcentaje;
        int contador=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                do {
                    System.out.println("Ingrese la nota "+(j+1)+" del alumno "+(i+1));
                porcentaje=read.nextInt();
                } while (porcentaje<0||porcentaje>10);
                if (j==0){
                    matriz[i][j]=porcentaje*0.10;
                }
                if (j==1){
                    matriz[i][j]=porcentaje*0.15;
                }
                if (j==2){
                    matriz[i][j]=porcentaje*0.25;
                }
                if (j==3){
                    matriz[i][j]=porcentaje*0.50;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                vector[i]+=matriz[i][j];
            }   
            if (vector[i]>=7){
               contador+=1; 
            }
        }
        System.out.println("Hay "+contador+" alumnos aprobados siendo sus notas finales:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" ["+vector[i]+"]");
        }
    }
    
}
