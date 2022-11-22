/*
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package introjava.pkg1;

/**
 *
 * @author Facundo
 */
public class Extras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b=20, c=40,a=10, d=80;
        //b=>c, c=>a, a=>d, d=>b;
        int aux;
        System.out.println(" A "+a+" B "+b+" C "+c+" D "+d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        
        System.out.println("A "+a+" B "+b+" C "+c+" D "+d);
    }
    
}
