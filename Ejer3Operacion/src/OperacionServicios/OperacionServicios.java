/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionServicios;

import OperacionEntidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class OperacionServicios {
    
    public Operacion crearOperacion(){
    
    Scanner read = new Scanner(System.in);
    
        System.out.println("Ingrese num1 y num2");
        
        return new Operacion(read.nextInt(),read.nextInt());
    }
    public int Sumar( int n1, int n2){
        int resultado=n1+n2;
        return resultado;
    }
    public void Restar( int n1, int n2){
        System.out.println("La resta de los numeros es " + (n1 - n2));
    }
    public void Multiplicacion(int n1, int n2){
        if (n1==0||n2==0){
            System.out.println("La multiplicacion por cero siempre es cero");
        }else{
            System.out.println("El resultado de la multiplicacion es " + (n1*n2));
        }
    }
    public void Division(int n1, int n2){
        if (n1==0 || n2==0){
            System.out.println("No se puede dividir por cero");
        }else{
            System.out.println("El resultado de la division es " + (n1/n2));
        }
    }
}
