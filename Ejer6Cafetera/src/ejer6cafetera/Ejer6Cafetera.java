/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6cafetera;

import CafeteraEntidades.Cafetera;
import CafeteraService.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer6Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        Boolean bucle = true;
        
        CafeteraService service= new CafeteraService();
        
        Cafetera cafe1 = service.llenarCafetera();
        do {
            System.out.println("Opciones: \n"
                    + "1-Servir taza\n"
                    + "2-Vaciar cafetera\n"
                    + "3-Agregar cafe\n"
                    + "4-Salir");
            int opcion = read.nextInt();
            switch (opcion){
                case 1:
                    cafe1.setCapacidadActual(service.servirTaza(cafe1.getCapacidadActual()));
                    System.out.println("Desea realizar otra operacion?S/N");
                    if (read.next().equalsIgnoreCase("N")||read.next().equalsIgnoreCase("n")) {
                        bucle = false;
                        break;
                    }else {
                        continue;
                    }
                case 2:
                    cafe1.setCapacidadActual(service.vaciarCafetera(cafe1.getCapacidadActual()));
                    System.out.println("Desea realizar otra operacion?S/N");
                    if (read.next().equalsIgnoreCase("N")||read.next().equalsIgnoreCase("n")) {
                        bucle = false;
                        break;
                    }else {
                        continue;
                    }
                case 3:
                    cafe1.setCapacidadActual(service.agregarCafe(cafe1.getCapacidadActual()));
                    System.out.println("Desea realizar otra operacion?S/N");
                    if (read.next().equalsIgnoreCase("N")||read.next().equalsIgnoreCase("n")) {
                        bucle = false;
                        break;
                    }else if(read.next().equalsIgnoreCase("S")){
                        continue;
                    }
                case 4:
                    bucle = false;
                    break;
                default:
                    System.out.println("No seleciono ninguna de las opciones");
            }
        } while (bucle);
        
        
                
        
        
        
        
        
        
    }
    
}
