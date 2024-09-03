/*
 * Author       = Brian Rodriguez
 * Date         = September 18 2019
 * Description  = This program is for print odd numbers from 11 to 99
 */
package p1t50_odd_numbers_from_1_to_99;

public class P1T50_Odd_numbers_from_1_to_99 {

    public static void main(String[] args) {

        System.out.println("Program for print the odd numbers from 11 to 99");
        for (int i = 11; i <= 99; i += 1) {
            if (i % 2 != 0) {
                System.out.println("Este numero es impar: " + i);
            }
        }
    }

}
