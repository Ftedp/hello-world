/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionEntidades;

/**
 *
 * @author Facundo
 */
public class Operacion {
    private int n1;
    private int n2;

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operacion() {
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }
    
    
}
