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
public class Ejercicio15 {
    
    /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/
    
    public static void main(String[] args) {
        
        int[] numeros = new int[100];
        
        rellenarArreglo(numeros);
        mostrarArreglo(numeros);
    }
    
    public static void rellenarArreglo(int[] arreglo)
    {
        int SIZE = 100;
        
        
        for (int i = 0;i < SIZE;i++){
            
            arreglo[i] = i + 1;
        }
    }
    
    public static void mostrarArreglo(int[] arreglo){
        int SIZE = 100;
        
        for (int i = 0; i < SIZE; i ++){
            
            System.out.println(arreglo[i]);
        }
            
    }
    
}
