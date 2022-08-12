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
public class Ejercicio10 {
    
    /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
    
    public static void main(String[] args) {
        
   
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un limite");
        int limite = read.nextInt();
        int suma = 0;
        int numero;
        
        while(suma < limite){
            System.out.println("Ingrese un numero");
            numero = read.nextInt();
            
            suma = suma + numero;
        
        }
        
        System.out.println(suma);
        
        
    }
    
}
