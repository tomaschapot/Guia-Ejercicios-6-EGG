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
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = read.nextLine();
        
        String resultado = esVocal(letra);
        
        System.out.println(resultado);

    }
    
    public static String esVocal(String letra){
        
        boolean esVocal = false;
        
        String vocales[] = {"a","e","i","o","u"};
        
        for(int i = 0;i < 5; i++){
            
            if(letra.equals(vocales[i])){
                esVocal = true;
            }
        }
        
        if(esVocal == true){
            return "La Letra es Vocal";
        }else{
            return "La Letra no es Vocal";
        }
        
    }
    
}
