/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13curso;

import Curso.Curso;
import ServiceCurso.ServiceCurso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer13Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiceCurso sc = new ServiceCurso();
        Curso c1 = sc.crearCurso();
        int gananciaSemanal=sc.calcularGananciaSemanal(c1.getCantidadDiasPorSemana(),c1.getCantidadHorasPorDia(),c1.getPrecioPorHora());
        
        System.out.println("El curso compuesto por los alumnos:\n"
                + " " + Arrays.toString(c1.getAlumnos())+"\n"
                        + "Produce una ganancia semanal de $"+gananciaSemanal);
        
        
    }
    
}
