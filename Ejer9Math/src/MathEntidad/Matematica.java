/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathEntidad;

/**
 *
 * @author Facundo
 */
public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor(double n1, double n2){
        double mayor;
        if (n1>n2) {
            System.out.println(n1 + " Es mayor y el menor es "+n2);
            mayor=n1;
        }else if (n2>n1) {
            System.out.println(n2 + " Es mayor y el menor es "+n1);
            mayor=n2;
        }else{
            System.out.println("Los numeros son iguales");
            mayor=n1;
        }
        return mayor;
    }
    
    public void potenciaMayor( double mayor, double menor){
        double potencia;
        potencia=Math.pow(mayor, menor);
        System.out.println("La potencia de "+mayor+"^"+menor+" es: "+ potencia);
        System.out.println("");
    }
    public void raizCuadrada(double menor){
        System.out.println("La raiz cuadrada de "+menor+" es "+Math.sqrt(menor));
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
