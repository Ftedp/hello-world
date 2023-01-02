/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroServicio;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class LibroServicio {
    
    
    public Libro LibroServicio(){
        Libro L1= new Libro();
        
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro:");
        L1.setIsbn(read.nextLine());
        System.out.println("Ingrese el Titulo del libro");
        L1.setTitulo(read.nextLine());
        System.out.println("Ingrese el nombre del Autor");
        L1.setAutor(read.nextLine());
        System.out.println("Ingrese el numero de paginas");
        L1.setNumeroPaginas(read.nextLine());
        return L1;
        
    }

    
}
