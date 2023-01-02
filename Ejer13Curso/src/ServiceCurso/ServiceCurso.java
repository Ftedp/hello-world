/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceCurso;

import Curso.Curso;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ServiceCurso {
    
    public String[] cargarAlumnos(){
        Curso c1 = new Curso();
        Scanner read = new Scanner(System.in);
        String [] arrAux = new String[5];
        System.out.println("Vamos a ingresar los nombres de los alumnos de éste curso");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno" + i);
            arrAux[i]=read.nextLine();
        }
        
        c1.setAlumnos(arrAux);
        
        return c1.getAlumnos();
    }
    
    public Curso crearCurso(){
        Curso c1 = new Curso();
        ServiceCurso sc = new ServiceCurso();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso: ");
        c1.setNombreCurso(read.nextLine());
        System.out.println("Ingrese la cantidad de horas por dia: ");
        c1.setCantidadHorasPorDia(read.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana: ");
        c1.setCantidadDiasPorSemana(read.nextInt());
        System.out.println("Precio por hora: ");
        c1.setPrecioPorHora(read.nextInt());
        c1.setAlumnos(sc.cargarAlumnos());
        return c1;       
    }
    public int calcularGananciaSemanal(int diasPorSemana, int horasPorDia, int precioPorHora ){
        int ganancia;
        ganancia= diasPorSemana*horasPorDia*precioPorHora*5;
        return ganancia;
    }
}
