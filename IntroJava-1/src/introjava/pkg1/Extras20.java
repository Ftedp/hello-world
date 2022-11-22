/*
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package introjava.pkg1;

/**
 *
 * @author Facundo
 */
public class Extras20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] vector= new double [10];
        Llenado(vector);
        Imprime(vector);
    }
    public static double[] Llenado(double pepe[]){
        double [] retorno= new double[10];
        for (int i = 0; i < 10; i++) {
            pepe[i]=Math.random()*10;
            retorno[i]=pepe[i];
        }
        return retorno; 
    }
    public static void Imprime(double vect[]){
        for (int i = 0; i < 10; i++) {
            System.out.println("["+vect[i]+"]");
        }
    }
}
