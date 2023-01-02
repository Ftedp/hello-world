 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayEntidad;

/**
 *
 * @author Facundo
 */
public class Objeto {
    private double [] A;
    private double [] B;

    public Objeto() {
    }

    public Objeto(double[] A, double[] B) {
        this.A = A;
        this.B = B;
    }

    public double[] getA() {
        return A;
    }

    public double[] getB() {
        return B;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    public void setB(double[] B) {
        this.B = B;
    }
    
    
}
