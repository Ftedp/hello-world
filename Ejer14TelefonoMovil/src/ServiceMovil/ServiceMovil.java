/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceMovil;

import Movil.Movil;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ServiceMovil {
    
    public Movil cargarCelular(){
        Movil m1 = new Movil();
        Scanner read = new Scanner(System.in);
        int [] arrAux = new int[7];
        System.out.println("Ingresar marca del celular: ");
        m1.setMarca(read.nextLine());
        System.out.println("Precio: ");
        m1.setPrecio(read.nextInt());
        System.out.println("Modelo: ");
        m1.setModelo(read.next());
        System.out.println("Memoria RAM: ");
        m1.setMemoriaRam(read.nextInt());
        System.out.println("Almacenamiento: ");
        m1.setAlmacenamiento(read.nextInt());
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el numero " + i + " de su codigo: ");
            arrAux[i]=read.nextInt();
        }
        m1.setCodigo(arrAux);
        return m1;
    }
}
