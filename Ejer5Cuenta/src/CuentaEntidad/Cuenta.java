/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaEntidad;

/**
 *
 * @author Facundo
 */
public class Cuenta {
    private int numeroCuenta;
    private long idCliente;
    private int saldoActual;
    

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long idCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.idCliente = idCliente;
        this.saldoActual = saldoActual;
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    
    
    
    
}
