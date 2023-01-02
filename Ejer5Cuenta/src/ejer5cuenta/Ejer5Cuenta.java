/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5cuenta;

import CuentaEntidad.Cuenta;
import CuentaService.CuentaService;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ejer5Cuenta {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        CuentaService service = new CuentaService();
        Cuenta c1 = service.crearCuenta();
        Boolean bucle=true;
        Boolean bandera=true;
        do {
            System.out.println("    Bienvenido:\n"
                    + "\n"
                    + "Menu de opciones:\n"
                    + "1-Ingresar dinero a la cuenta\n"
                    + "2-Retirar dinero de la cuenta\n"
                    + "3-Extraccion rapida de dinero\n"
                    + "4-Consulta de Saldo\n"
                    + "5-Informacion personal\n"
                    + "6-Salir");
            int opcion= read.nextInt();
            switch (opcion){
                case 1:
                    c1.setSaldoActual(service.ingresar(c1.getSaldoActual()));
                    System.out.println("Desea realizar otra operacion? S/N");
                    if (read.next().equalsIgnoreCase("N")||read.next().equalsIgnoreCase("n")) {
                        bucle=false;
                        break;
                    }else{
                        break;
                    }
                case 2:
                    c1.setSaldoActual(service.retirar(c1.getSaldoActual())); 
                    System.out.println("Desea realizar otra operacion? S/N");
                    if (read.next().equalsIgnoreCase("N")||read.next().equalsIgnoreCase("n")) {
                        bucle=false;
                        break;
                    }else if (read.next().equalsIgnoreCase("S")){
                        break;
                    }
                case 3:
                    c1.setSaldoActual(service.extraccionRapida(c1.getSaldoActual()));
                    System.out.println("Desea realizar otra operacion? S/N");
                    if (read.next().equalsIgnoreCase("N")||read.next().equalsIgnoreCase("n")) {
                        bucle=false;
                        break;
                    }else {
                        break;
                    }
                case 4:
                    service.consultaSaldo(c1.getSaldoActual());
                    System.out.println("Desea realizar otra operacion? S/N");
                    if (read.next().equalsIgnoreCase("N")||read.next().equalsIgnoreCase("n")) {
                        bucle=false;
                        break;
                    }else {
                        break;
                    }
                case 5:
                    service.consultaDatos(c1.getNumeroCuenta(),c1.getIdCliente(),c1.getSaldoActual());
                    System.out.println("Desea realizar otra operacion? S/N");
                    if (read.next().equalsIgnoreCase("N")||read.next().equalsIgnoreCase("n")){
                        bucle=false;
                        break;
                    }else {
                        break;
                    }
                case 6:   
                    bucle=false;
                    break;
            }   
        } while (bucle);  
    }
}
