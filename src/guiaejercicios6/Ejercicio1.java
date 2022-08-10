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
public class Ejercicio1 {
    /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("Escribe el numero 1");
        int numero1 = read.nextInt();
        System.out.println("Escribe el numero 2");
        int numero2 = read.nextInt();
        
        int resultado = numero1 + numero2;
        
        System.out.println("El resultado es" + " " + resultado);
    
    }
    
}
