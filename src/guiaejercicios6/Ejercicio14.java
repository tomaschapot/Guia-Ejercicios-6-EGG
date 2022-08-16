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
public class Ejercicio14 {

    /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una cantidad de Euros");
        float euros = read.nextFloat();
        
        
        read.nextLine();
        System.out.println("Introduce a que moneda los quieres convertir(libras,dolares o yenes)");
        String monedaAConvertir = read.nextLine();
        
        convertidorDeDivisas(euros,monedaAConvertir);

    }

    public static void convertidorDeDivisas(float euros, String monedaAConvertir) {

        switch (monedaAConvertir) {
            case "libras":
                System.out.println(euros * 0.86);
                break;
            case "dolares":
                System.out.println(euros * 1.28611);
                break;
            case "yenes":
                System.out.println(euros * 129.852);
        }
    }
}
