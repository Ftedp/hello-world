/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7personaimc;

import PersonaEntidades.Persona;
import PersonaService.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer7PersonaIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        
        PersonaService service= new PersonaService();
        float [] arrayImc= new float[4];
        boolean [] arrayEdad= new boolean[4];
        
        Persona persona0 = service.crearPersona();
        persona0.setImc(service.calcularIMC(persona0.getPeso(), persona0.getAltura()));
        arrayImc[0]=persona0.getImc();
        boolean mayoriaEdad0 = service.mayorEdad(persona0.getEdad());
        arrayEdad[0]=mayoriaEdad0;

        Persona persona1 = service.crearPersona();
        
        persona1.setImc(service.calcularIMC(persona1.getPeso(), persona1.getAltura()));
        arrayImc[1]=persona1.getImc();
        boolean mayoriaEdad1 = service.mayorEdad(persona1.getEdad());
        
        arrayEdad[1]=mayoriaEdad1;
        
        System.out.println("");
        Persona persona2 = service.crearPersona();
        
        persona2.setImc(service.calcularIMC(persona2.getPeso(), persona2.getAltura()));
        arrayImc[2]=persona2.getImc();
        boolean mayoriaEdad2 = service.mayorEdad(persona2.getEdad());
        
        arrayEdad[2]=mayoriaEdad2;
        

        Persona persona3 = service.crearPersona();
        
        persona3.setImc(service.calcularIMC(persona3.getPeso(), persona3.getAltura()));
        arrayImc[3]=persona3.getImc();
        boolean mayoriaEdad3 = service.mayorEdad(persona3.getEdad());
        
        arrayEdad[3]=mayoriaEdad3;
        
         //porcentaje de IMCs 
        
        float promedioImc= service.imcPromedio(persona0.getImc(), persona1.getImc(), persona2.getImc(), persona3.getImc());
        System.out.println("El IMC promedio de la poblacion es"+promedioImc);
        System.out.println("");
        //cuantos por encima de la linea de IMC, por debajo, y cuantos en condiciones optimas de salud4
        int malNutricion=0,pesoOptimo=0,sobrePeso=0;
        for (int i = 0; i < 4; i++) {
            if (arrayImc[i]<20){
                malNutricion+=1;
            }else if(arrayImc[i]>20&&arrayImc[i]<25){
                pesoOptimo+=1;
            }else if(arrayImc[i]>25){
                sobrePeso+=1;
            }
        }
        System.out.println(malNutricion+" individuos con indice de masa corporal bajo\n"
                +pesoOptimo + " individuos con indice de masa corporal indicado\n"
                        + sobrePeso + " individuos con indice de masa corpotal alto");
        //porcentaje de personas mayores y menores
        System.out.println("");
        
        int mayoresEdad=0, menoresEdad=0;
        
        for (int i = 0; i < 4; i++) {
            if (arrayEdad[i]==true) {
                mayoresEdad+=1;
            }else{
                menoresEdad+=1;
            }
        }
        System.out.println("Mayores de edad: " +mayoresEdad
                + "Menores de edad: "+menoresEdad);
    }
    
}
