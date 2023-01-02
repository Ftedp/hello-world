/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceCadena;

import CadenaEntidad.Cadena;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Facundo
 */
public class ServiceCadena {
    public Cadena crearCadena(){
        Scanner read= new Scanner(System.in);
        
        Cadena c1 = new Cadena();
        System.out.println("Ingrese la frase");
        
        c1.setFrase(read.nextLine());
        
        c1.setLongitud(c1.getFrase().length());
        System.out.println("");
        return c1;
    }
    
    public void contabilizarVocales(char [] vectorFrase, int longitudCadena){
        int vocalesCont=0;
        
        for (int i = 0; i < longitudCadena; i++){
            if ('a'==vectorFrase[i] || 'e'==vectorFrase[i] || 'i'==vectorFrase[i] || 'o'==vectorFrase[i] || 'u'==vectorFrase[i]){
            vocalesCont+=1;
            }
        }
        System.out.println("La cantidad de vocales es: "+vocalesCont);
        System.out.println("");
    }
    public void invertirFrase(char [] vectorFrase, int longitudCadena){
        System.out.println("Frase invertida");
        for (int i = longitudCadena-1; i > -1; i--) {
            System.out.print("  "+vectorFrase[i]);        
        }
        System.out.println("");
    }
    public void vecesRepetido(char [] vectorFrase, int longitudCadena){
        Scanner read= new Scanner(System.in);
        String letra;
        int contador=0;
        System.out.println("Ingrese la letra que desea buscar: ");
        letra=read.next();
        char [] letter=letra.toCharArray();
        
        for (int i = 0; i < longitudCadena; i++) {
            if (letter[0]==vectorFrase[i]) {
                contador+=1;
            }
        }
        System.out.println("El caracter "+letra+" se repite " + contador+ " veces");
        System.out.println("");     
    }
    public void compararLongitud(int longFrase, int longFraseComp){
        if (longFrase>longFraseComp) {
            System.out.println("Lo siento, la frase original es más larga, por " +(longFrase-longFraseComp)+ " caracteres.");
        }else if(longFraseComp>longFrase){
            System.out.println("Lo siento, la nueva frase es más larga, por " +(longFraseComp-longFrase) + " caracteres.");
        }else{
            System.out.println("Felicitaciones, la longitud de las frases son iguales!");
        }
        System.out.println("");
    }
    public void unirFrases(String fraseOriginal, String fraseComparativa){
        System.out.println(fraseOriginal.concat(fraseComparativa));
        
    }
    public void reemplazarLetra(char [] fraseOriginal, int longitudfrase){
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el caracter que reemplazara la letra ,a,");
        String reemplazo=read.next();
        char replacement=reemplazo.charAt(0);
        for (int i = 0; i < longitudfrase; i++) {
            if (fraseOriginal[i]=='a') {
                fraseOriginal[i]=replacement;
            }
        }
        System.out.println("Imprimiento frase:"+ Arrays.toString(fraseOriginal));
    }
    public boolean contiene(char [] fraseOriginal, int longitudFrase){
        Scanner read=new Scanner(System.in);
        boolean bandera=false;
        System.out.println("Ingrese el caracter que esta buscando");
        String caracter=read.next();
        char caracBuscado=caracter.charAt(0);
        for (int i = 0; i < longitudFrase; i++) {
            if (fraseOriginal[i]==caracBuscado) {
                System.out.println("El caracter se encuentra aqui");
                bandera=true;
            }
        }
        System.out.println("");
        return bandera;
    }
}
