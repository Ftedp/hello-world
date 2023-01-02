/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraEntidades;

/**
 *
 * @author Facundo
 */
public class Cafetera {
    public int capacidadMax;
    public int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int capacidadActual) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    
}
