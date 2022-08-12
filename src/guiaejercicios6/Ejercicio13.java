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
public class Ejercicio13 {

    /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * **/
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos por lado");
        int elementosPorLado = read.nextInt();
        
        //Guardo la primera linea, ultima, linea actual y elementos que representan los asteriscos.
        int PRIMERALINEA = 0;
        int ULTIMALINEA = elementosPorLado;
        int lineaActual = 0;
        int elementoActual = lineaActual;
        
        
        //Lo que pasa cuando estoy en la primer o ultima linea
        while (lineaActual < ULTIMALINEA) {
            if (lineaActual == PRIMERALINEA || lineaActual == ULTIMALINEA - 1) {
                while (elementoActual <= ULTIMALINEA - 1) {
                    System.out.print("*");
                    elementoActual = elementoActual + 1;
                }
        //Lo que pasa cuando estoy en las lineas del medio
            } else {
                while (elementoActual <= ULTIMALINEA - 1) {
                    if (elementoActual == 0 || elementoActual == ULTIMALINEA - 1) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                    elementoActual = elementoActual + 1;
                }
            }
            System.out.println("");
            elementoActual = 0;
            elementosPorLado = elementosPorLado - 1;
            lineaActual++;

        }

    }

}
