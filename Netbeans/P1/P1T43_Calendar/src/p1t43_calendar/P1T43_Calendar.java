/*
 * Author       = Brian Rodriguez Rodriguez
 * Date         = September 16 2019
 * Description  = Program to know the number of days of a month
 */
package p1t43_calendar;

import java.util.Scanner;

public class P1T43_Calendar {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("This program is designed to know how many days has a month, please input a number: ");
        int month = Keyboard.nextInt();

        if (month >= 1 && month <= 12) {
            if (month == 2) {
                System.out.println("The month has 29 days and 28 days in a leap-year ");
            } else if (month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12) {
                System.out.println("The month has 31 days ");

            } else {
                System.out.println("The month has 30 days ");
            }

        } else {
            System.out.println("You entered a number different of 1-12 ");
        }

    }
}
