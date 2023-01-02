/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaService;

import PersonaEntidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class PersonaService {
    Scanner read= new Scanner(System.in);
    
    public Persona crearPersona(){
        
        String nombre;
        int edad;
        String sexo;
        float peso;
        float altura;
            
        System.out.println("Ingrese su nombre");
        nombre=read.next();
        System.out.println("Ingrese su edad");
        edad=read.nextInt();
        System.out.println("Ingrese su sexo: M)Masculino, F)Femenino, O)Otro.");
        sexo=read.next();
        if (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("O"))) {
            do {
            System.out.println("La opcion ingresada no es correcta, ingresela nuevamente");
            sexo=read.next();
            } while (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("O")));
        }
        System.out.println("Ingrese el peso");
        peso=read.nextFloat();
        System.out.println("Ingrese su altura");
        altura=read.nextFloat();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    public float calcularIMC(float peso, float altura){
        
        float calculo=peso/(altura*altura);
        if (calculo<20){
            System.out.println("IMC: "+calculo);
            System.out.println("Se encuentra por debajo del peso ideal");
        }else if (calculo>=20&&calculo<=25){
            System.out.println("IMC:"+ calculo);
            System.out.println("Está en su peso ideal");
        }else if (calculo>25){
            System.out.println("IMC: "+calculo);
            System.out.println("Se encuentra por encima de su peso ideal");
        }
        return calculo;
    }
    public boolean mayorEdad(int edad){
        boolean bandera=true;
        if (edad<18){
            bandera=false;
        }  
        return bandera;       
    }
    public float imcPromedio(float resultado0, float resultado1, float resultado2, float resultado3){
        float promedio = (resultado0+resultado1+resultado2+resultado3)/4;
        return promedio;
    }
    
    
}
