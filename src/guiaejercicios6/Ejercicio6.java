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
public class Ejercicio6 {
    
    /*Crear un programa que dado un numero determine si es par o impar.*/
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int numero = read.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("Es Par");
        }else{
            System.out.println("Es Impar");
        }
    }
    
}
