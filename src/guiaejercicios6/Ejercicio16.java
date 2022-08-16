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
public class Ejercicio16 {
    /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Cual es el tamanio del vector");
        
        int tamanioVector = read.nextInt();
        
        System.out.println("Ingrese un numero a Buscar");
        int numeroAEncontrar = read.nextInt();
        
        int vector[] = new int[tamanioVector];
        
        llenarArregloAleatorio(vector,tamanioVector);
        mostrarArreglo(vector,tamanioVector);
        encontrarNumero(vector,tamanioVector,numeroAEncontrar);
        

    }
    
    
    
    
    
    public static void llenarArregloAleatorio(int arreglo[],int tamanioVector){

        for (int i = 0 ; i < tamanioVector;i++ ){
           int numeroAleatorio = (int) (Math.random()*100); 
           
           arreglo[i] = numeroAleatorio;
   
        }
        
    }
    public static void encontrarNumero(int arreglo[], int tamanioVector, int numeroAEncontrar){
        
        int contador = 0;
       
        
        for (int i = 0; i < tamanioVector;i++){
            
          
                
               if (numeroAEncontrar == arreglo[i]){
                   contador  = contador + 1;
               } 
           
            
            if (numeroAEncontrar == arreglo[i]){
                
                System.out.println("Encontrado en la posicion " + i);
            }
             if (i == tamanioVector - 1){
                System.out.println("El numero se Repite: " + contador + " veces");
            }
        }
    } 
    
     public static void mostrarArreglo(int[] arreglo,int tamanioVector){
        
        
        for (int i = 0; i < tamanioVector; i ++){
            
            System.out.println(arreglo[i]);
        }
            
    }
    
    
}
