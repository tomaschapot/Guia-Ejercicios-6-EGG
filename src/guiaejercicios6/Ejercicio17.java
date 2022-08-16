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
public class Ejercicio17 {
    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos)*/
    
     public static void main(String[] args) {
         
         Scanner read = new Scanner(System.in);
         
         System.out.println("Cual es la dimension del vector");
         int dimensionVector = read.nextInt();
         
         int vector[] = new int[dimensionVector];
         
         llenarArregloAleatorio(vector,dimensionVector);
         contabilizarNumeros(vector,dimensionVector);
         
         

         
     }
     
    public static void llenarArregloAleatorio(int arreglo[],int tamanioVector){

        for (int i = 0 ; i < tamanioVector;i++ ){
           int numeroAleatorio = (int) (Math.random()*10000); 
           
           arreglo[i] = numeroAleatorio;
   
        }
    }
    
    public static void contabilizarNumeros(int vector[], int dimensionVector){
        
        int numerosUnDigito = 0;
        int numeroDosDigitos = 0;
        int numeroTresDigitos = 0;
        int numeroCuatroDigitos = 0;
        int numeroCincoDigitos = 0;
        
        for (int i = 0 ; i < dimensionVector; i++){
            
            int numeroActual = vector[i];
            
            int cantidadDeCifras = 0;
            
            
            //Chequeo cuantas cifras tiene
            while(numeroActual != 0)
            {
                numeroActual = numeroActual/10;
                cantidadDeCifras++;
            }
            
            if(cantidadDeCifras == 1){
                numerosUnDigito ++;
            }
            if(cantidadDeCifras == 2){
                numeroDosDigitos ++;
            }
            if(cantidadDeCifras == 3){
                numeroTresDigitos ++;
            }
            if(cantidadDeCifras == 4){
                numeroCuatroDigitos ++;
            }
            if(cantidadDeCifras == 5){
               numeroCincoDigitos ++;
            }
        }
        
        System.out.println("La cantidad de numeros de un digito es de: " + numerosUnDigito);
        System.out.println("La cantidad de numeros de dos digitos es de: " + numeroDosDigitos);
        System.out.println("La cantidad de numeros de tres digito es de: " + numeroTresDigitos);
        System.out.println("La cantidad de numeros de cuatro digito es de: " + numeroCuatroDigitos);
        System.out.println("La cantidad de numeros de cinco digito es de: " + numeroCincoDigitos);
        
    }
    
}
