/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaejercicios6;

/**
 *
 * @author tomic
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        
        int a = 0;
        int b = 10;
        int c = 5;
        int d = 23;
        
        System.out.println("Valores Iniciales: " + a + " " + b + " " + c + " " + d);
        swap(a,b,c,d);
    }
    
    public static void swap (int a,int b, int c, int d){
        
        int aux;
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux; 
        System.out.println("Valores Finales: " + a + " " + b + " " + c + " " + d);
    }
    
}
