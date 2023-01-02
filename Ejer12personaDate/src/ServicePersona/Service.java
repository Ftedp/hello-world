/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicePersona;

import PersonaDateEntidad.Entidades;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Service {
    public Entidades crearPersona(){
        Entidades p1 = new Entidades();
       Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        p1.setNombre(read.nextLine());
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia");
        int dia = read.nextInt();
        System.out.println("Mes");
        int mes = read.nextInt();
        System.out.println("Año");
        int anio = read.nextInt();
        Date nacimiento = new Date(anio-1900,mes-1,dia);
        p1.setNacimiento(nacimiento);
        
        return p1;
    }
    public int calcularEdad(Entidades p1){
        Date fechaActual = new Date();
        Date fechaNacimiento = p1.getNacimiento(); 
        int edad = (fechaActual.getYear()-fechaNacimiento.getYear());
        
        return edad;  
    }
    public boolean menorQue(int edad){
        Scanner read= new Scanner(System.in);
        boolean buleano=true;
             
        System.out.println("Ingrese la edad de otra persona para comparar");
        int nuevaEdad=read.nextInt();
        if (nuevaEdad>=edad) {
            buleano=false;
        }
        
        return buleano;
    }
}
