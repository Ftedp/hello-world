/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8cadena;

import CadenaEntidad.Cadena;
import ServiceCadena.ServiceCadena;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer8Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        
        ServiceCadena sc = new ServiceCadena();
        
        Cadena c0=sc.crearCadena();
        
        char [] vectorFrase= new char[c0.getLongitud()];
        for (int i = 0; i < c0.getLongitud(); i++) {
            vectorFrase[i]=(c0.getFrase().charAt(i));
        }
        System.out.println("");
        
        sc.contabilizarVocales(vectorFrase, c0.getLongitud());
        
        sc.invertirFrase(vectorFrase, c0.getLongitud());
        
        sc.vecesRepetido(vectorFrase, c0.getLongitud());
        
        System.out.println("Ingrese una frase para comparar");
        String fraseComparativa=read.nextLine();
        
        int longFraseComp=fraseComparativa.length();
        
       
        
        System.out.println("Comparando...");
        System.out.println("");
        sc.compararLongitud(c0.getLongitud(),longFraseComp);
        
        sc.unirFrases(c0.getFrase(), fraseComparativa);
       
        sc.reemplazarLetra(vectorFrase, c0.getLongitud());
        
        sc.contiene(vectorFrase, c0.getLongitud());
        
        System.out.println(c0.toString() +" "+ Arrays.toString(vectorFrase));
        
        
    }
    
}
