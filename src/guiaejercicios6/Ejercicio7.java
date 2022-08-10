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
public class Ejercicio7 {
    
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.*/
    
     public static void main(String[] args) {
         
         Scanner read = new Scanner (System.in);
         
         System.out.println("Escriba una frase");
         String frase = read.nextLine();
         
         if (frase.equals("eureka")){
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");
         }

    }
    
}
