/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaejercicios6;

import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class Ejercicio4 {
    
    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    
     public static void main(String[] args) {
         
         Scanner read = new Scanner(System.in);
         
         System.out.println("Ingrese una temperatura en C");
         
         float temperatura = read.nextFloat();
         
         cAFarenheit(temperatura);
   
     }
     
     public static void cAFarenheit(float temperatura){
         
         float F = 32 + (9 * temperatura/5);
         
         System.out.println("La Temperatura en Farenheit es de: " + F);
         
     }
    
}
