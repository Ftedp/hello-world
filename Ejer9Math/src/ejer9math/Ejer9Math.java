/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9math;

import MathEntidad.Matematica;

/**
 *
 * @author Facundo
 */
public class Ejer9Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica n1=new Matematica();
        n1.setNum1(Math.random()*100);
        n1.setNum2(Math.random()*100);
        
        
        
        double mayor=Math.floor(n1.devolverMayor(n1.getNum1(), n1.getNum2()));
        System.out.println("");
        n1.setNum1(Math.floor(n1.getNum1()));
        n1.setNum2(Math.floor(n1.getNum2()));
        if (mayor==n1.getNum1()){
        n1.potenciaMayor(n1.getNum1(),n1.getNum2());
        n1.raizCuadrada(n1.getNum2());
        }else{
            n1.potenciaMayor(n1.getNum2(), n1.getNum1());
            n1.raizCuadrada(n1.getNum1());
        }
        System.out.println("");
        
        
        
        System.out.println(n1.toString());
    }
    
}
