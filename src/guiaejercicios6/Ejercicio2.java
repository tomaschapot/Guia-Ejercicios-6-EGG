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
public class Ejercicio2 {
    
    /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("Escribe tu nombre");
        
        String nombre = read.nextLine();
        
        
        System.out.println("Hola "+ nombre);
            
    
        
        
        
    }
    
}
