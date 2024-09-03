/*
 * Author       = Brian Rodriguez Rodriguez
 * Date         = September 16 2019
 * Description  = Program to know if a number is even or odd
 */
package p1t41_number_even_or_odd;

import java.util.Scanner;

public class P1T41_number_even_or_odd {

    public static void main(String[] args) {
        System.out.println("This program is designed to know if a number is even or odd, please input the number: ");
        Scanner teclado = new Scanner(System.in);
        int number = teclado.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even ");
        } else {
            System.out.println("The number is odd ");
        }

    }

}
