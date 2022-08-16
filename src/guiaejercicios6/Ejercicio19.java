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
public class Ejercicio19 {
    /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)*/
    public static void main(String[] args) {
        
        int matriz[][] = new int[4][4];
        
        int matrizTranspuesta[][] = new int[4][4];
        
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        
        transponerMatriz(matriz,matrizTranspuesta);
        
        System.out.println("");
        mostrarMatriz(matrizTranspuesta);
        esAntiSimetrica(matriz,matrizTranspuesta);
        
        
        
    
        
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
    
    public static void esAntiSimetrica(int matriz[][],int matrizTranspuesta[][]){
        
        String esTranspuesta = "Verdadero";
        
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                
                int numeroMatriz = matriz[i][j];
                int numeroMatrizTranspuesta = - matrizTranspuesta[i][j];
                
                if (numeroMatriz != numeroMatrizTranspuesta){
                    esTranspuesta = "Falso";
                }
            }
        }
        
        System.out.println(esTranspuesta);
        
    }
    
}
