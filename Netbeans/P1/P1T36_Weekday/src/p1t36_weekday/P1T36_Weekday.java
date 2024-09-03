/*
 * Author     = Brian Rodriguez Rodriguez
 * Date       = September 11 2019
 * Directory  = This program is to print the day of the week in letters
 */
package p1t36_weekday;

import java.util.Scanner;

public class P1T36_Weekday {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa diseñado para saber el dia de la semana con un número, Ingrese un número: ");
        int day = teclado.nextInt();
        if (day >= 1 && day <= 7) {
            if (day == 1) {
                System.out.println("El día es Lunes ");
            } else {
                if (day == 2) {
                    System.out.println("El día es Martes ");
                } else {
                    if (day == 3) {
                        System.out.println("El día es Miércoles ");
                    } else {
                        if (day == 4) {
                            System.out.println("El día es Jueves ");
                        } else {
                            if (day == 5) {
                                System.out.println("El día es Viernes ");
                            } else {
                                if (day == 6) {
                                    System.out.println("El día es Sábado ");
                                } else {

                                    System.out.println("El día es Domingo ");
                                }
                            }
                        }
                    }
                }
            }

        } else {
            System.out.println("Valor erróneo ");
        }
    }

}
