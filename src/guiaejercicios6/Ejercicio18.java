/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaejercicios6;

/**
 *
 * @author tomic
 */
public class Ejercicio18 {

    /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/
    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        int nuevaMatriz[][] = new int[4][4];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        transponerMatriz(matriz, nuevaMatriz);
        mostrarMatriz(nuevaMatriz);

    }

    public static void rellenarMatriz(int matriz[][]) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int numeroAleatorio = (int) (Math.random() * 10);

                matriz[i][j] = numeroAleatorio;
            }
        }

    }

    public static void mostrarMatriz(int matriz[][]) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static void transponerMatriz(int matriz[][], int nuevaMatriz[][]) {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                nuevaMatriz[j][i] = matriz[i][j];

            }
        }

    }

}
