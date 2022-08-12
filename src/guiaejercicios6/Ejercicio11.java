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
public class Ejercicio11 {
    
    /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        
        System.out.println("Elige el numero 1");
        int numero1 = read.nextInt();
        System.out.println("Elige el numero 2");
        int numero2 = read.nextInt();
        
        menu(numero1,numero2,read);
        
        
    }
    
    public static void menu(int numero1, int numero2, Scanner read){
        
        int opcion = 0;
        
        while(opcion != 5){
            
            System.out.println("Elige una opcion:");
            opcion = read.nextInt();
            
            switch(opcion){
                
                case 1:
                    System.out.println("Resultado Suma:" + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Resultado Resta:" + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Resultado Multiplicar:" + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("Resultado Dividir:" + (numero1 / numero2));
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
            }
            
        }
        
        
    }

}


