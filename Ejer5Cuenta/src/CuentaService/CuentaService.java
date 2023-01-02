/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaService;

import CuentaEntidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class CuentaService {
    Scanner read = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        System.out.println("    Bienvenido:\n"
                + " Ingrese numero de cuenta\n"
                + " Numero de ID\n"
                + " Saldo actual");
        return new Cuenta(read.nextInt(),read.nextLong(),read.nextInt());
    }
    /**
     * 
     * @param saldoActual
     * @return saldoActual+ingresos
     */
    public int ingresar(int saldoActual){
        int ingreso;
        System.out.println("Cuanto dinero desea ingresar?");
        ingreso=read.nextInt();
        System.out.println("Ingreso realizado");
        saldoActual=saldoActual+ingreso;
        System.out.println("El dinero total de su cuenta es: "+ saldoActual);
        System.out.println("");
        return saldoActual;
    }
    /**
     * 
     * @param saldoActual
     * @return saldoActual-retiro
     */
    public int retirar(int saldoActual){
        int retiro;
        System.out.println("Cuando dinero desea retirar?");
        retiro=read.nextInt();
        if (retiro>=saldoActual){
            retiro= saldoActual;
            saldoActual=0;
            System.out.println("Su retiro es de $"+retiro+"\n"
                    + "y su saldo actual es de $"+ saldoActual);
        }else if (retiro<saldoActual){
            saldoActual=saldoActual-retiro;
            System.out.println("Su retiro de $"+retiro+" se realizo con exito\n"
                    + "Su saldo actual es de $"+saldoActual);
        }
        System.out.println("");
        return saldoActual;
    }
    public int extraccionRapida(int saldoActual){
        int retiro;
        do {
            System.out.println("La extraccion rapida solo contempla el 20% de su saldo\n"
                + " Cuando desea retirar?");
            retiro=read.nextInt();
        } while (retiro>(saldoActual*.2));
        System.out.println("La cantidad de dinero retirado es $"+ retiro);
        saldoActual=saldoActual-retiro;
        System.out.println("Su saldo actual es $"+ saldoActual);
        System.out.println("");
        return saldoActual;
    }
    public void consultaSaldo(int saldoActual){
         
        System.out.println("Su saldo actual es de $"+saldoActual);
    }
    public void consultaDatos(int numeroCuenta, long idCliente, int saldoActual){
        System.out.println("Numero de cuenta "+numeroCuenta+"\n"
                + "Numero de ID "+idCliente+"\n"
                + "Saldo Actual $"+saldoActual);
        System.out.println("");
    }
    
}
