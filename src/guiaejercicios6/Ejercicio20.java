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
public class Ejercicio20 {

    /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Creo la Matriz
        int matriz[][] = new int[3][3];

        llenarMatriz(matriz, read);
        mostrarMatriz(matriz);
        esCuadradoMagico(matriz);

    }

    public static void llenarMatriz(int matriz[][], Scanner read) {

        int numerosCorrectos = 0;
        int numero;
        int numerosElegidos[] = new int[9];
        int contador = 0;

        //Cargo un vector con 9 numeros validados
        while (numerosCorrectos != 9) {
            System.out.println("Introduce un numero");
            numero = read.nextInt();

            if (numero > 10 || numero < 1) {
                System.out.println("El numero introducido no es "
                        + "correcto, vuelva a ingresarlo");

            } else {
                numerosElegidos[numerosCorrectos] = numero;
                numerosCorrectos++;
            }
        }

        //lleno la matriz con los numeros validados
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = numerosElegidos[contador];
                contador++;
            }
        }
    }

    public static void mostrarMatriz(int matriz[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static void esCuadradoMagico(int matriz[][]) {

        int sumaFila1 = 0;
        int sumaFila2 = 0;
        int sumaFila3 = 0;
        int sumaDiagonal = 0;
        int sumaColumna1 = 0;
        int sumaColumna2 = 0;
        int sumaColumna3 = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                //Sumo todos los numeros en las diagonales
                if (i == j) {
                    sumaDiagonal = sumaDiagonal + matriz[i][i];
                }
                //Fila1
                if (i == 0) {
                    sumaFila1 = sumaFila1 + matriz[i][j];
                }
                //Fila2
                if (i == 1) {
                    sumaFila2 = sumaFila2 + matriz[i][j];
                }
                //Fila3
                if (i == 2) {
                    sumaFila3 = sumaFila3 + matriz[i][j];
                }
                //Columna1
                if (j == 0) {
                    sumaColumna1 = sumaColumna1 + matriz[i][j];
                }
                //Columna2
                if (j == 1) {
                    sumaColumna2 = sumaColumna2 + matriz[i][j];
                }
                //Columna3
                if (j == 2) {
                    sumaColumna3 = sumaColumna3 + matriz[i][j];
                }

            }
        }

        if (sumaColumna1 == sumaDiagonal && sumaColumna2 == sumaDiagonal
                && sumaColumna3 == sumaDiagonal && sumaFila1 == sumaDiagonal
                && sumaFila2 == sumaDiagonal && sumaFila3 == sumaDiagonal) {

            System.out.println("Es Cubo Magico");

        } else {
            System.out.println("No es Cubo Magico");
        }

    }

}
