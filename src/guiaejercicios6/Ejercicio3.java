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
public class Ejercicio3 {
    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Escribe una frase");
        String frase = read.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());

    }
    
}
