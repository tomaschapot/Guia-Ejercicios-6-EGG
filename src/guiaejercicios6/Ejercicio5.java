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
public class Ejercicio5 {
    
    /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int numero = read.nextInt();
        
        System.out.println(numero*2);
        System.out.println(numero*3);
        System.out.println(Math.sqrt(numero));
        
        
    }
    
}
