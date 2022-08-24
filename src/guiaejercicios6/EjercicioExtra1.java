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
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

        Scanner read = new Scanner(System.in);

        System.out.println("Ingreese un tiempo en minutos");
        double minutos = read.nextInt();

        String calculo = calculoHoras(minutos);
        
        System.out.println(calculo);

    }

    public static String calculoHoras(double minutos) {

        String cantidadHoras;

        long horasDia, dia;

        dia = (long) Math.floor(minutos / 1440);
        horasDia = (long) Math.floor(((minutos - (dia * 1440)) / 60));

        cantidadHoras = "La cantidad es de: " + dia + " dias " + horasDia + " Horas";
    
        return cantidadHoras;
    }

}
