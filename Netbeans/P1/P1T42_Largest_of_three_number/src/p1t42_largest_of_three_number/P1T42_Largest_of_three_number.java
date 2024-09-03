/*
 * Author       = Brian Rodriguez Rodriguez
 * Date         = September 16 2019
 * Description  = Program to know the largest of three numbers 
 */
package p1t42_largest_of_three_number;

import java.util.Scanner;

public class P1T42_Largest_of_three_number {

    public static void main(String[] args) {
        System.out.println("This program is designed to know the larges of three numbers, please input the 1° number: ");
        Scanner teclado = new Scanner(System.in);
        float number1 = teclado.nextFloat();
        System.out.println("Please input the 2° number: ");
        float number2 = teclado.nextFloat();
        System.out.println("Please input the 3° number: ");
        float number3 = teclado.nextFloat();
        if (number1 == number2 && number1 == number3) {
            System.out.println("The numbers are iqual ");
        } else {
            if (number1 > number2 && number1 > number3) {
                System.out.println("The largest number is number 1: " + number1);

            } else {
                if (number2 > number3) {
                    System.out.println("The largest number is number 2: " + number2);

                } else {
                    System.out.println("The largest number is number 3: " + number3);
                }

            }

        }
    }

}
