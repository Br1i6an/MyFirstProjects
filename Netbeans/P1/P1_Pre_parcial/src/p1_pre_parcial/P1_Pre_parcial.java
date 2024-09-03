/*
 * Author       = Brian Rodriguez
 * Date         = September 18 2019
 * Description  = This program is for calculate the age of many people
 */
package p1_pre_parcial;

import java.util.Scanner;

public class P1_Pre_parcial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para saber la edad de muchas personas, promedio y cual es la edad más alta, ingrese 1 para comenzar o 0 para salir : ");
        int option = teclado.nextInt();
        int edadmax = 0;
        int edadmin = 0;
        int edadsuma = 0;
        int totalpersonas = 0;
        while (option == 1) {
            System.out.println("Ingrese el año de nacimiento para la persona ");
            int age = 2019 - teclado.nextInt();
            totalpersonas = totalpersonas + 1;
            edadsuma = edadsuma + age;
            if (totalpersonas == 1) {
                edadmax = age;
                edadmin = age;

            } else {
                if (age > edadmax) {
                    edadmax = age;
                }
                if (age < edadmin){
                    edadmin = age;
                }
            }

            System.out.println(" ingrese 1 para continuar o 0 para salir : ");
            option = teclado.nextInt();
        }
        double average = edadsuma/totalpersonas;
        System.out.println("Edad máxima = "+edadmax+", Edad mínima = "+edadmin+"\n"+"Edad promedio = "+average+" total personas = "+totalpersonas);
    }
}
