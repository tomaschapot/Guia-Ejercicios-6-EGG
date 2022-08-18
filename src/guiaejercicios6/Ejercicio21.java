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
public class Ejercicio21 {

    /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.*/
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int matrizGrande[][] = new int[10][10];
        int matrizChica[][] = new int[3][3];

        rellenarMatriz(matrizGrande);
        rellenarMatriz(matrizChica);
        verificarMatrices(matrizGrande, matrizChica);

    }

    public static void rellenarMatriz(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                int numeroAleatorio = (int) (Math.random() * 10);

                matriz[i][j] = numeroAleatorio;
            }
        }

    }

    public static void verificarMatrices(int matrizGrande[][], int matrizChica[][]) {

        int nuevaMatriz[][] = new int[3][3];

        for (int i = 0; i < matrizGrande.length; i++) {

            for (int j = 0; j < matrizGrande.length; j++) {

                if (j < matrizGrande.length - 2) {
                    String seEncuentra = "Verdadero";

                    for (int y = 0; y < matrizChica.length; y++) {
                        for (int u = 0; u < matrizChica.length; u++) {

                            nuevaMatriz[y][u] = matrizGrande[i + y][j + u];
                        }
                    }

                    for (int x = 0; x < matrizChica.length; x++) {

                        for (int w = 0; w < matrizChica.length; w++) {

                            if (matrizChica[i][j] != nuevaMatriz[i][j]) {
                                seEncuentra = "Falso";

                            }

                        }
                    }

                    System.out.println(seEncuentra);

                }

            }

        }

    }
}
