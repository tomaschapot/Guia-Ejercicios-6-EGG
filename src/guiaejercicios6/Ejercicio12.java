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
public class Ejercicio12 {
    
    /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        int secuenciasCorrectas = 0;
        int secuenciasIncorrectas = 0;
        String primerCaracter;
        String ultimoCaracter;
        int longitudSecuencia;
        String secuencia;
        
        int salir = 0;
        
        while (salir == 0){
            
            System.out.println("Ingrese una secuencia");
            
            read.nextLine();
            secuencia = read.nextLine();
            
            
            longitudSecuencia = secuencia.length();
            primerCaracter = secuencia.substring(0,1);
            ultimoCaracter = secuencia.substring(longitudSecuencia -1, longitudSecuencia);
            
            
            if( longitudSecuencia <= 5 && primerCaracter.equals("X")  && ultimoCaracter.equals("O")){
                secuenciasCorrectas++;
            }else{
                secuenciasIncorrectas++;
            }
            
            System.out.println("Desea salir?");
            
            salir = read.nextInt();
    
        }
        
        System.out.println(secuenciasCorrectas);
        System.out.println(secuenciasIncorrectas);
    }

}
