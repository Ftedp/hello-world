/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraService;

import CafeteraEntidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class CafeteraService {
    Scanner read=new Scanner(System.in);
    
    public Cafetera llenarCafetera(){
        System.out.println("Ingrese la cantidad maxima de cafe, y la cantidad actual");
        return new Cafetera(read.nextInt(),read.nextInt());
    }
    public int servirTaza(int capacidadActual){
        int taza;
        System.out.println("Ingrese el tamaño de la taza");
        taza=read.nextInt();
        if (taza>capacidadActual) {
            taza=capacidadActual;
            capacidadActual=0;
            System.out.println("La taza no se lleno\n"
                    + " contiene solo "+taza+"grs de cafe");
            System.out.println("Capacidad actual en la cafetera = 0gr");
        }else if (taza<capacidadActual){
            capacidadActual-=taza;
            System.out.println("La taza se lleno");
            System.out.println("La capacidad actual de cafe es:"+capacidadActual+"gr");
        }
        return capacidadActual;
    }
    public int vaciarCafetera(int capacidadActual){
        capacidadActual=0;
        System.out.println("La cafetera esta vacía");
        return capacidadActual;
    }
    public int agregarCafe(int capacidadActual){
        System.out.println("Ingrese 100grs de café para 4 tazas");
        capacidadActual+=read.nextInt();
        return capacidadActual;
    }
}
